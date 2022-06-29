package co.sofka.com.prestamo.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.sofka.com.prestamo.entities.RegistroPrestamo;

public class RegistroAsociadoAprestamo extends DomainEvent {
    private final RegistroPrestamo registro;
    public RegistroAsociadoAprestamo(RegistroPrestamo registro) {
        super("co.sofka.com.prestamo.RegistroAsociadoAprestamo");
        this.registro = registro;
    }

    public RegistroPrestamo getRegistro() {
        return registro;
    }
}
