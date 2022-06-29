package co.sofka.com.prestamo.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.sofka.com.biblioteca.values.BibliotecaId;
import co.sofka.com.prestamo.values.PrestamoId;

public class BibliotecaAgregada extends DomainEvent {
    private final PrestamoId prestamoId;
    private final BibliotecaId id;
    public BibliotecaAgregada(PrestamoId prestamoId, BibliotecaId id) {
        super("co.sofka.com.prestamo.Bibliotecaagregada");
        this.prestamoId = prestamoId;
        this.id= id;
    }

    public BibliotecaId getId() {
        return id;
    }

    public PrestamoId getPrestamoId() {
        return prestamoId;
    }
}
