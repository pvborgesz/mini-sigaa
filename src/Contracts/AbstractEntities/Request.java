package Contracts.AbstractEntities;

import Enums.TypeEnum;

public abstract class Request {
    protected TypeEnum type;
    protected String year;
    protected int semester;
    protected String course;
    protected int vacancies;
    protected String schedule;
    protected Space allocatedSpace;

    public Request(TypeEnum type, String year, int semester, String course, int vacancies, String schedule) {
        this.type = type;
        this.year = year;
        this.semester = semester;
        this.course = course;
        this.vacancies = vacancies;
        this.schedule = schedule;
        this.allocatedSpace = null;
    }

    public TypeEnum getType() {
        return type;
    }

    public String getYear() {
        return year;
    }

    public int getSemester() {
        return semester;
    }

    public String getCourse() {
        return course;
    }

    public int getVacancies() {
        return vacancies;
    }

    public String getSchedule() {
        return schedule;
    }

    public Space getAllocatedSpace() {
        return allocatedSpace;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setVacancies(int vacancies) {
        this.vacancies = vacancies;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public void setAllocatedSpace(Space allocatedSpace) {
        this.allocatedSpace = allocatedSpace;
    }


    public abstract void allocateSpace(Space space);

    public abstract void deallocateSpace();

}
