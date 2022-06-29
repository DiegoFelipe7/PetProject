package co.sofka.com.biblioteca.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.sofka.com.biblioteca.values.BibliotecarioId;

/**
 * Evento de dominio para crear Biblioteca
 *
 * @author Ricardo Ortega <tattortega.28@gmail.com>
 * @version 1.0.0 2022-06-29
 * @since 1.0.0
 */
public class BibliotecaCreada extends DomainEvent {

    private final BibliotecarioId bibliotecarioId;

    public BibliotecaCreada(BibliotecarioId bibliotecarioId) {
        super("co.sofka.com.biblioteca.bibliotecacreada");
        this.bibliotecarioId = bibliotecarioId;
    }

    public BibliotecarioId bibliotecarioId() {
        return bibliotecarioId;
    }
}
