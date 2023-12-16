package Controllers;

import Contracts.AbstractEntities.PhysicalSpace;
import Contracts.AbstractEntities.Request;
import Contracts.AbstractEntities.Space;
import Contracts.Interfaces.AllocationManager;

public class AllocationManagerImpl implements AllocationManager {

    private SpaceManagerImpl spaceManagerImpl;
    public AllocationManagerImpl(SpaceManagerImpl spaceManagerImpl) {
        this.spaceManagerImpl = spaceManagerImpl;
    }

    @Override
    public void allocateSpaces(Request[] requests, Space[] spaces) {
        for (Request request : requests) {
            Space suitableSpace = spaceManagerImpl.findSuitableSpace(request);
            if (suitableSpace != null) {
                request.allocateSpace(suitableSpace);
                System.out.println("Espaço alocado para a solicitação: " + request);
            } else {
                System.out.println("Não foi possível encontrar um espaço para a solicitação: " + request);
            }

        }

        // Salvar o estado aqui
    }



    @Override
    public void loadAllocations(String filePath) {

    }
}
