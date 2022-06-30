package co.sofka.com.prestamo.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.sofka.com.prestamo.values.Fecha;
import co.sofka.com.prestamo.Prestamo;
import co.sofka.com.prestamo.values.PrestamoId;

/**
 * @author Juan Ignacio Ramallo
 * @version 1.0.0
 * Driven domain design -  Evento de dominio nuevo prestamo creado.
 */
public class NuevoPrestamoCreado extends DomainEvent {

    private final Fecha fecha;

    public NuevoPrestamoCreado(Fecha fecha) {
        super("co.sofka.com.prestamo.NuevoPrestamoCreado");
        this.fecha = fecha;
    }

    public Fecha getFecha() {
        return fecha;
    }
}
