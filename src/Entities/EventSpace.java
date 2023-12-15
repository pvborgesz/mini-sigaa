package Entities;

import Contracts.AbstractEntities.Space;
import Enums.TypeEnum;

public class EventSpace extends Space {
    private String finality;

    public EventSpace(String year, int semester, String course, int vacancies, String schedule, String finality) {
        super(year, semester, course, vacancies, schedule, TypeEnum.EVENT);
        this.finality = finality;
    }

    public String getFinality() {
        return finality;
    }

    public void setFinality(String finality) {
        this.finality = finality;
    }
}
