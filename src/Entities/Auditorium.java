package Entities;

import Contracts.AbstractEntities.PhysicalSpace;

public class Auditorium extends PhysicalSpace {
    public Auditorium(String name, int capacity, String location) {
        super(name, capacity, location);
    }

    @Override
    public String toString() {
        return "Auditorium{" + "name=" + name + ", capacity=" + capacity + ", location=" + location + '}';
    }
}
