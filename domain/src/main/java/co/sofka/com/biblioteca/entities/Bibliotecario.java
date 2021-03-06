package co.sofka.com.biblioteca.entities;

import co.com.sofka.domain.generic.Entity;
import co.sofka.com.biblioteca.values.BibliotecarioId;
import co.sofka.com.valuesgeneric.Nombre;

/**
 * Entidad Bibliotecario
 *
 * @author Ricardo Ortega <tattortega.28@gmail.com>
 * @version 1.0.0 2022-06-29
 * @since 1.0.0
 */
public class Bibliotecario extends Entity<BibliotecarioId> {

    private Nombre nombre;

    public Bibliotecario(BibliotecarioId bibliotecarioId, Nombre nombre) {
        super(bibliotecarioId);
        this.nombre = nombre;
    }

    public Nombre nombre() {
        return nombre;
    }

    public void actualizarNombre(Nombre nombre) {
        this.nombre = nombre;
    }
}
