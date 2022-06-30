package co.sofka.com.prestamo.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.sofka.com.libro.values.IdLibro;
import co.sofka.com.prestamo.values.PrestamoId;

/**
 * @author  Juan Ignacio Ramallo
 * @version 1.0.0
 * Driven domain design -  Evento de dominio agregado de un libro al prestamo.
 */
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
