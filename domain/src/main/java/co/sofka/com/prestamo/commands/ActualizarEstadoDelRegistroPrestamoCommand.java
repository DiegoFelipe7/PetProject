package co.sofka.com.prestamo.commands;

import co.com.sofka.domain.generic.Command;
import co.sofka.com.prestamo.values.EstadoPrestamo;
import co.sofka.com.prestamo.values.PrestamoId;
import co.sofka.com.prestamo.values.RegistroPrestamoId;

public class ActualizarEstadoDelRegistroPrestamoCommand extends Command {
   private final  PrestamoId prestamoId;
    private final RegistroPrestamoId registroPrestamoId;
    private final EstadoPrestamo estadoPrestamo;

    public ActualizarEstadoDelRegistroPrestamoCommand(PrestamoId prestamoId, RegistroPrestamoId registroPrestamoId, EstadoPrestamo estadoPrestamo) {
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
