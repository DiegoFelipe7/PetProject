package co.sofka.com.biblioteca.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.sofka.com.biblioteca.values.BibliotecarioId;
import co.sofka.com.valuesgeneric.Nombre;

/**
 * Evento de dominio para agregar Bibliotecario
 *
 * @author Ricardo Ortega <tattortega.28@gmail.com>
 * @version 1.0.0 2022-06-29
 * @since 1.0.0
 */
public class BibliotecarioAgregado extends DomainEvent {
    private final BibliotecarioId bibliotecarioId;
    private final Nombre nombre;

    public BibliotecarioAgregado(BibliotecarioId bibliotecarioId, Nombre nombre) {
        super("co.sofka.com.biblioteca.bibliotecarioagregado");
        this.bibliotecarioId = bibliotecarioId;
        this.nombre = nombre;
    }

    public BibliotecarioId bibliotecarioId() {
        return bibliotecarioId;
    }

    public Nombre nombre() {
        return nombre;
    }
}
