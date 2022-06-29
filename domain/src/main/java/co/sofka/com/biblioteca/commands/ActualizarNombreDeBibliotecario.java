package co.sofka.com.biblioteca.commands;

import co.com.sofka.domain.generic.Command;
import co.sofka.com.biblioteca.values.BibliotecaId;
import co.sofka.com.valuesgeneric.Nombre;

/**
 * Comando para actualizar nombre del Bibliotecario
 *
 * @author Ricardo Ortega <tattortega.28@gmail.com>
 * @version 1.0.0 2022-06-29
 * @since 1.0.0
 */
public class ActualizarNombreDeBibliotecario extends Command {

    private final BibliotecaId bibliotecaId;
    private final Nombre nombre;

    public ActualizarNombreDeBibliotecario(BibliotecaId bibliotecaId, Nombre nombre) {
        this.bibliotecaId = bibliotecaId;
        this.nombre = nombre;
    }

    public BibliotecaId bibliotecaId() {
        return bibliotecaId;
    }

    public Nombre nombre() {
        return nombre;
    }
}
