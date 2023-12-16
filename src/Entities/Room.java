package Entities;


import Contracts.AbstractEntities.PhysicalSpace;

//Uma classe para representar salas de aula, incluindo atributos como capacidade, nome e localização.
public class Room extends PhysicalSpace {
    public Room(String name, int capacity, String location, String year, int semester, String course, int vacancies, String schedule) {
        super(name, capacity, location, year, semester, course, vacancies, schedule);
    }

    @Override
    public String toString() {
        return "Room{" + "name=" + name + ", capacity=" + capacity + ", location=" + location + '}';
    }
}
