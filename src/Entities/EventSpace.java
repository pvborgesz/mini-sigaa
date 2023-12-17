package Entities;

import Contracts.AbstractEntities.Request;
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

    @Override
    public void allocateSpace(Request request) {
        if (this.getVacancies() < request.getVacancies()) {
            System.out.println("O espaço não possui vagas suficientes para a solicitação.");
            return;
        }

        if (!this.getCourse().equals(request.getCourse())) {
            System.out.println("O espaço não é adequado para o curso da solicitação.");
            return;
        }

        if (!this.getSchedule().equals(request.getSchedule())) {
            System.out.println("O espaço não é adequado para o horário da solicitação.");
            return;
        }

        if (!this.getYear().equals(request.getYear())) {
            System.out.println("O espaço não é adequado para o ano da solicitação.");
            return;
        }

        // Alocando o espaço
        request.setAllocatedSpace(this);
        System.out.println("Espaço alocado com sucesso para a solicitação.");
    }
}
