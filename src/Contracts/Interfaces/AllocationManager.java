package Contracts.Interfaces;
public interface AllocationManager {
    void readRequests(String filePath);
    void allocateSpaces();
    void saveAllocations(String filePath);
    void loadAllocations(String filePath);
}

