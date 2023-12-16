package Contracts.AbstractEntities;


import Enums.TypeEnum;

public abstract class PhysicalSpace extends Space{
    protected String name;
    protected int capacity;
    protected String location;

    public PhysicalSpace(String name, int capacity, String location, String year, int semester, String course, int vacancies, String schedule) {
        super(year, semester, course, vacancies, schedule, TypeEnum.CLASS);
        this.name = name;
        this.capacity = capacity;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getLocation() {
        return location;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}

