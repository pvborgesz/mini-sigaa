package Entities;

import Contracts.AbstractEntities.Request;
import Contracts.AbstractEntities.Space;
import Enums.TypeEnum;

public class FixedRequest extends Request {
    private String discipline;

    public FixedRequest(String year, int semester, String course, String discipline, int vacancies, String schedule) {
        super(TypeEnum.FIXED, year, semester, course, vacancies, schedule);
        this.discipline = discipline;
    }

    @Override
    public void allocateSpace(Space space) {
        if (this.getAllocatedSpace() != null) {
            System.out.println("Já existe um espaço alocado para esta solicitação.");
            return;
        }

        if (space.getVacancies() < this.getVacancies()) {
            System.out.println("O espaço não possui vagas suficientes para a solicitação.");
            return;
        }

        if (!space.getCourse().equals(this.getCourse())) {
            System.out.println("O espaço não é adequado para o curso da solicitação.");
            return;
        }

        if (!space.getSchedule().equals(this.getSchedule())) {
            System.out.println("O espaço não é adequado para o horário da solicitação.");
            return;
        }

        if (!space.getYear().equals(this.getYear())) {
            System.out.println("O espaço não é adequado para o ano da solicitação.");
            return;
        }

        // Alocando o espaço
        this.setAllocatedSpace(space);
        System.out.println("Espaço alocado com sucesso para a solicitação.");
    }

    @Override
    public void deallocateSpace() {
        // Verifica se existe um espaço alocado para esta solicitação
        if (this.getAllocatedSpace() == null) {
            System.out.println("Nenhum espaço está atualmente alocado para esta solicitação.");
            return;
        }

        // Desalocando o espaço
        this.setAllocatedSpace(null);
        System.out.println("Espaço desalocado com sucesso.");
    }


    @Override
    public String toString() {
        return "Solicitação Fixa: " + super.toString() + ", Disciplina: " + this.discipline;
    }
}
