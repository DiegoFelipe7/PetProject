package co.sofka.com.prestamo.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.sofka.com.prestamo.values.Fecha;
import co.sofka.com.prestamo.Prestamo;
import co.sofka.com.prestamo.values.PrestamoId;

public class NuevoPrestamoCreado extends DomainEvent {

    private final Fecha fecha;
    public NuevoPrestamoCreado( Fecha fecha) {
        super("co.sofka.com.prestamo.NuevoPrestamoCreado");

        this.fecha =fecha;
    }

    public Fecha getFecha() {
        return fecha;
    }
}
