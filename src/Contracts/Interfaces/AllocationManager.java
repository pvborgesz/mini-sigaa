package Contracts.Interfaces;

import Contracts.AbstractEntities.Request;
import Contracts.AbstractEntities.Space;

public interface AllocationManager {
    void allocateSpaces(Request[] requests, Space[] spaces);
    void loadAllocations(String filePath);
}

