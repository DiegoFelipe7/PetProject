package co.sofka.com.prestamo.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.sofka.com.libro.values.IdLibro;

public class LibroAgregado extends DomainEvent {
    private final IdLibro idLibro;
    public LibroAgregado(IdLibro idLibro) {
        super("co.sofka.com.prestamo.LibroCreado");
        this.idLibro= idLibro;
    }

    public IdLibro getIdLibro() {
        return idLibro;
    }
}
