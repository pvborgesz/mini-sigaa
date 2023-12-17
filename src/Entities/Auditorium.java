package Entities;

import Contracts.AbstractEntities.PhysicalSpace;
import Contracts.AbstractEntities.Request;

public class Auditorium extends PhysicalSpace {
    public Auditorium(String name, int capacity, String location, String year, int semester, String course, int vacancies, String schedule) {
        super(name, capacity, location, year, semester, course, vacancies, schedule);
    }

    @Override
    public String toString() {
        return "Auditorium{" + "name=" + name + ", capacity=" + capacity + ", location=" + location + '}';
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
