package Entities;

import Contracts.AbstractEntities.Space;
import Enums.TypeEnum;

public class FixedSpace extends Space {
    private String discipline;

    public FixedSpace(String year, int semester, String course, int vacancies, String schedule, String discipline) {
        super(year, semester, course, vacancies, schedule, TypeEnum.CLASS);
        this.discipline = discipline;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }
}
