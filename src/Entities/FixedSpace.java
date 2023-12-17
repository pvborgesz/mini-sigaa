package Entities;

import Contracts.AbstractEntities.Request;
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
