package co.sofka.com.prestamo.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.sofka.com.libro.values.IdLibro;
import co.sofka.com.prestamo.values.PrestamoId;

public class LibroAgregado extends DomainEvent {
    private final PrestamoId prestamoId;
    private final IdLibro idLibro;

    public LibroAgregado(PrestamoId prestamoId, IdLibro idLibro) {
        super("co.sofka.com.prestamo.LibroCreado");
        this.prestamoId = prestamoId;
        this.idLibro= idLibro;
    }

    public IdLibro getIdLibro() {
        return idLibro;
    }

    public PrestamoId getPrestamoId() {
        return prestamoId;
    }
}
