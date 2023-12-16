package Contracts.Interfaces;

import Contracts.AbstractEntities.Request;
import Contracts.AbstractEntities.Space;

public interface SpaceManager {
    Space findSuitableSpace(Request request);
}
