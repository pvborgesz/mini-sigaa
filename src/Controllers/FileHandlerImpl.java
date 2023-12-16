package Controllers;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import Contracts.AbstractEntities.Request;
import Contracts.Interfaces.FileHandler;
import Entities.*;

public class FileHandlerImpl implements FileHandler {
    private List<Request> requests = new ArrayList<>();

    @Override
    public void readRequests(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean isFirstLine = true; // Adicionado para tratar o cabeçalho

            while ((line = br.readLine()) != null) {
                if (isFirstLine) {
                    isFirstLine = false;
                    continue; // Pula a primeira linha (cabeçalho)
                }

                String[] parts = line.split(";");
                if (parts.length != 7) continue; // Verifica o formato da linha

                try {
                    String type = parts[0];
                    String year = parts[1];
                    int semester = Integer.parseInt(parts[2]);
                    String course = parts[3];
                    String data = parts[4];
                    int vacancies = Integer.parseInt(parts[5]);
                    String schedule = parts[6];

                    Request request;
                    if ("FIXA".equals(type)) {
                        request = new FixedRequest(year, semester, course, data, vacancies, schedule);
                    } else if ("EVENTUAL".equals(type)) {
                        request = new EventRequest(year, semester, course, vacancies, schedule, data);
                    } else {
                        continue; // Se não for nem FIXA nem EVENTUAL, ignora a linha
                    }

                    requests.add(request);
                } catch (NumberFormatException e) {
                    System.err.println("Erro ao converter número: " + e.getMessage());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Override
   public void saveAllocations(String filePath) {
       try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
           for (Request request : requests) {
               if (request.getAllocatedSpace() != null) {
                   bw.write(request.getAllocatedSpace().toString());
                   bw.newLine();
               }
           }
       } catch (IOException e) {
           e.printStackTrace();
       }
   }

    @Override
    public String toString() {
        return "FileHandlerImpl{" +
                "requests=" + requests +
                '}';
    }
}
