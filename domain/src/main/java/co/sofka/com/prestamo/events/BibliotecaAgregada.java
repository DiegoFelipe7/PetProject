package co.sofka.com.prestamo.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.sofka.com.biblioteca.values.BibliotecaId;

public class BibliotecaAgregada extends DomainEvent {
    private final BibliotecaId id;
    public BibliotecaAgregada(BibliotecaId id) {
        super("co.sofka.com.prestamo.Bibliotecaagregada");
        this.id= id;
    }

    public BibliotecaId getId() {
        return id;
    }
}
