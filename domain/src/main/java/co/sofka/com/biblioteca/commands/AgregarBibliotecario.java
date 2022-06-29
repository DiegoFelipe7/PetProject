package co.sofka.com.biblioteca.commands;

import co.com.sofka.domain.generic.Command;
import co.sofka.com.biblioteca.values.BibliotecaId;
import co.sofka.com.biblioteca.values.BibliotecarioId;
import co.sofka.com.valuesgeneric.Nombre;

/**
 * Comando para agregar Bibliotecario
 *
 * @author Ricardo Ortega <tattortega.28@gmail.com>
 * @version 1.0.0 2022-06-29
 * @since 1.0.0
 */
public class AgregarBibliotecario extends Command {

    private final BibliotecaId bibliotecaId;
    private final BibliotecarioId bibliotecarioId;
    private final Nombre nombre;

    public AgregarBibliotecario(BibliotecaId bibliotecaId, BibliotecarioId bibliotecarioId, Nombre nombre) {
        this.bibliotecaId = bibliotecaId;
        this.bibliotecarioId = bibliotecarioId;
        this.nombre = nombre;
    }

    public BibliotecaId bibliotecaId() {
        return bibliotecaId;
    }

    public BibliotecarioId bibliotecarioId() {
        return bibliotecarioId;
    }

    public Nombre nombre() {
        return nombre;
    }
}
