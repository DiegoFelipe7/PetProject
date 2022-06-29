package co.sofka.com.libro.commands;

import co.com.sofka.domain.generic.Command;
import co.sofka.com.libro.values.Fecha;
import co.sofka.com.libro.values.IdLibro;
import co.sofka.com.libro.values.Titulo;

public class CrearLibroCommand extends Command {
    private final IdLibro entityId ;
    private final Titulo titulo;
    private final Fecha fecha;


    public CrearLibroCommand(IdLibro entityId, Titulo titulo, Fecha fecha) {
        this.entityId = entityId;
        this.titulo = titulo;
        this.fecha = fecha;
    }

    public IdLibro entityId() {
        return entityId;
    }

    public Titulo titulo() {
        return titulo;
    }

    public Fecha fecha() {
        return fecha;
    }
}
