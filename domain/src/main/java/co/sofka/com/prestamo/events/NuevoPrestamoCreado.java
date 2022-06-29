package co.sofka.com.prestamo.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.sofka.com.prestamo.values.Fecha;
import co.sofka.com.prestamo.Prestamo;
import co.sofka.com.prestamo.values.PrestamoId;

public class NuevoPrestamoCreado extends DomainEvent {
    private final PrestamoId id;
    private final Fecha fecha;
    public NuevoPrestamoCreado(PrestamoId id, Fecha fecha) {
        super("co.sofka.com.prestamo.NuevoPrestamoCreado");
        this.id = id;
        this.fecha =fecha;
    }

    public PrestamoId getId() {
        return id;
    }

    public Fecha getFecha() {
        return fecha;
    }
}
