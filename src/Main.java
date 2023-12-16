import Controllers.FileHandlerImpl;
public class Main {
    public static void main(String[] args) {
        try{
            // lendo solicitacoes
            FileHandlerImpl fileHandler = new FileHandlerImpl();
            fileHandler.readRequests("/Users/pvborges/Desktop/projetoBelo/src/database/requests.csv");
            fileHandler.saveAllocations("/Users/pvborges/Desktop/projetoBelo/src/database/allocations.csv");

            // alocando solicitacoes

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}