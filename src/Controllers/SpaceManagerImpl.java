package Controllers;

import Contracts.AbstractEntities.PhysicalSpace;
import Contracts.AbstractEntities.Request;
import Contracts.AbstractEntities.Space;
import Contracts.Interfaces.SpaceManager;
import Entities.Room;
import Entities.Auditorium;
import Enums.TypeEnum;

import java.util.List;

public class SpaceManagerImpl implements SpaceManager {

    private List<Room> rooms; // Lista de salas de aula disponíveis
    private List<Auditorium> auditoriums; // Lista de auditórios disponíveis

    public SpaceManagerImpl(List<Room> rooms, List<Auditorium> auditoriums) {
        this.rooms = rooms;
        this.auditoriums = auditoriums;
    }

    @Override
    public Space findSuitableSpace(Request request) {

        if (request.getType() == TypeEnum.FIXED) {
            for (Room room : rooms) {
                if (isSpaceSuitable(room, request)) {
                    return room;
                }
            }
            for (Auditorium auditorium : auditoriums) {
                if (isSpaceSuitable(auditorium, request)) {
                    return auditorium;
                }
            }
        } else if (request.getType() == TypeEnum.EVENT) {
            // Para eventos, procure apenas em auditórios
            for (Auditorium auditorium : auditoriums) {
                if (isSpaceSuitable(auditorium, request)) {
                    return auditorium;
                }
            }
        }

        // Se nenhum espaço adequado foi encontrado
        return null;
    }

    private boolean isSpaceSuitable(Space space, Request request) {
        // Implemente a lógica para determinar se o espaço é adequado
        // Isso pode incluir verificar a capacidade, disponibilidade, etc.
        return true; // Exemplo: sempre retorna verdadeiro (ajuste conforme necessário)
    }
}
