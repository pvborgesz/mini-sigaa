package Entities;


import Contracts.AbstractEntities.PhysicalSpace;

//Uma classe para representar salas de aula, incluindo atributos como capacidade, nome e localização.
public class Room extends PhysicalSpace {
    public Room(String name, int capacity, String location) {
        super(name, capacity, location);
    }

    @Override
    public String toString() {
        return "Room{" + "name=" + name + ", capacity=" + capacity + ", location=" + location + '}';
    }
}
