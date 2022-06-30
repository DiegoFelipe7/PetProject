package co.sofka.com.libro.commands;

import co.com.sofka.domain.generic.Command;
import co.sofka.com.libro.values.Fecha;
import co.sofka.com.libro.values.IdLibro;
import co.sofka.com.libro.values.Titulo;

/**
 * Comando  CrearLibroCommand
 *
 * @version 1.0.0 2022-06-29
 * @Author Diego Felipe Muñoz Mosquera
 * @since 1.0.0
 * *
 */
public class CrearLibroCommand extends Command {
    private final IdLibro idLibro;
    private final Titulo titulo;
    private final Fecha fecha;


    public CrearLibroCommand(IdLibro idLibro, Titulo titulo, Fecha fecha) {
        this.idLibro = idLibro;
        this.titulo = titulo;
        this.fecha = fecha;
    }

    public IdLibro idLibro() {
        return idLibro;
    }

    public Titulo titulo() {
        return titulo;
    }

    public Fecha fecha() {
        return fecha;
    }
}
