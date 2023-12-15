package Contracts.AbstractEntities;

import Enums.TypeEnum;

public abstract class Space {
    private String year;
    private int semester;
    private String course;
    private String discipline; //  para solicitações fixas
    private String finality;   //  para solicitações eventuais
    private int vacancies;
    private String schedule;
    private TypeEnum type;

    public Space(String year, int semester, String course, int vacancies, String schedule, TypeEnum type) {
        this.year = year;
        this.semester = semester;
        this.course = course;
        this.vacancies = vacancies;
        this.schedule = schedule;
        this.type = type;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public String getFinality() {
        return finality;
    }

    public void setFinality(String finality) {
        this.finality = finality;
    }

    public int getVacancies() {
        return vacancies;
    }

    public void setVacancies(int vacancies) {
        this.vacancies = vacancies;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }
}
