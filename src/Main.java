import Contracts.AbstractEntities.Request;
import Contracts.AbstractEntities.Space;
import Controllers.FileHandlerImpl;
import Controllers.SpaceManagerImpl;
import Entities.Auditorium;
import Entities.Room;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            // Inicialização
            ArrayList<Room> rooms = new ArrayList<>();
            ArrayList<Auditorium> auditoriums = new ArrayList<>();
            FileHandlerImpl fileHandler = new FileHandlerImpl();
            SpaceManagerImpl spaceManager = new SpaceManagerImpl(rooms, auditoriums);
            Scanner scanner = new Scanner(System.in);

            // Lendo solicitações
            fileHandler.readRequests("/Users/pvborges/Desktop/mini-sigaa/src/database/requests.csv");
            System.out.println("Solicitacoes lidas com sucesso!");

            // Processo interativo de alocação
            for (Request request : fileHandler.getRequests()) {
                System.out.println("Alocando espaco para a solicitacao: " + request);

                if (request.getAllocatedSpace() != null) {
                    System.out.println("Esta solicitacao ja tem um espaco alocado: " + request.getAllocatedSpace());
                    continue;
                }

                Space suitableSpace = spaceManager.findSuitableSpace(request);

                if (suitableSpace != null) {
                    request.allocateSpace(suitableSpace);
                    System.out.println("Espaco alocado: " + suitableSpace);
                } else {
                    System.out.println("Nenhum espaco adequado encontrado para esta solicitacao.");
                }

                // Salvando o estado atual após cada alocação
                fileHandler.saveAllocations("/Users/pvborges/Desktop/mini-sigaa/src/database/allocations.csv");

                // Verifica se o usuário quer continuar
                System.out.println("Deseja continuar alocando? (S/N)");
                String input = scanner.nextLine();
                if ("N".equalsIgnoreCase(input)) {
                    break;
                }
            }

            scanner.close();
            System.out.println("Processo de alocação concluído!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
