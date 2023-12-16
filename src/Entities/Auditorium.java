package Entities;

import Contracts.AbstractEntities.PhysicalSpace;

public class Auditorium extends PhysicalSpace {
    public Auditorium(String name, int capacity, String location, String year, int semester, String course, int vacancies, String schedule) {
        super(name, capacity, location, year, semester, course, vacancies, schedule);
    }

    @Override
    public String toString() {
        return "Auditorium{" + "name=" + name + ", capacity=" + capacity + ", location=" + location + '}';
    }
}
