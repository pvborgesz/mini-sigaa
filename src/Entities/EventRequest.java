package Entities;

import Contracts.AbstractEntities.Request;
import Contracts.AbstractEntities.Space;
import Enums.TypeEnum;

public class EventRequest extends Request {
    private String finality;

    public EventRequest(String year, int semester, String course, int vacancies, String schedule, String finality) {
        super(TypeEnum.EVENT, year, semester, course, vacancies, schedule);
        this.finality = finality;
    }

    public String getFinality() {
        return finality;
    }

    public void setFinality(String finality) {
        this.finality = finality;
    }

    @Override
    public String toString() {
        return "EventRequest{" + "year=" + year + ", semester=" + semester + ", course=" + course + ", vacancies=" + vacancies + ", schedule=" + schedule + ", finality=" + finality + '}';
    }

    @Override
    public void allocateSpace(Space space) {
        this.allocatedSpace = space;
    }

    @Override
    public void deallocateSpace() {
        this.allocatedSpace = null;
    }
}
