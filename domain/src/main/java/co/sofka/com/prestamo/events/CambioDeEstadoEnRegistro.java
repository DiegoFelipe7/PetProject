package co.sofka.com.prestamo.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.sofka.com.prestamo.values.EstadoPrestamo;
import co.sofka.com.prestamo.values.PrestamoId;
import co.sofka.com.prestamo.values.RegistroPrestamoId;

public class CambioDeEstadoEnRegistro extends DomainEvent {
    private final PrestamoId prestamoId;
    private final RegistroPrestamoId registroPrestamoId;
    private final EstadoPrestamo estadoPrestamo;

    public CambioDeEstadoEnRegistro(PrestamoId prestamoId, RegistroPrestamoId registroPrestamoId, EstadoPrestamo estadoPrestamo) {
        super("co.sofka.com.prestamo.CambioDeEstadoEnRegistro");

        this.prestamoId = prestamoId;
        this.registroPrestamoId = registroPrestamoId;
        this.estadoPrestamo = estadoPrestamo;
    }

    public PrestamoId getPrestamoId() {
        return prestamoId;
    }

    public RegistroPrestamoId getRegistroPrestamoId() {
        return registroPrestamoId;
    }

    public EstadoPrestamo getEstadoPrestamo() {
        return estadoPrestamo;
    }
}
