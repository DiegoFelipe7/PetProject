package co.sofka.com.prestamo.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.sofka.com.prestamo.entities.RegistroPrestamo;
import co.sofka.com.prestamo.values.PrestamoId;

/**
 * @author  Juan Ignacio Ramallo
 * @version 1.0.0
 * Driven domain design -  Evento de dominio registro asociado al prestamo.
 */
public class RegistroAsociadoAprestamo extends DomainEvent {
    private final PrestamoId prestamoId;
    private final RegistroPrestamo registro;
    public RegistroAsociadoAprestamo(PrestamoId prestamoId, RegistroPrestamo registro) {
        super("co.sofka.com.prestamo.RegistroAsociadoAprestamo");
        this.prestamoId = prestamoId;
        this.registro = registro;
    }

    public RegistroPrestamo getRegistro() {
        return registro;
    }

    public PrestamoId getPrestamoId() {
        return prestamoId;
    }
}
