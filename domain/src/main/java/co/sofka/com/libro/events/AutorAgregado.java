package co.sofka.com.libro.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.sofka.com.libro.values.IdAutor;
import co.sofka.com.valuesgeneric.Nombre;

/**
 * DomainEvent  AutorAgregado
 *
 * @author Diego Felipe Muñoz <diegofelipem99@gmail.com>
 * @version 1.0.0 2022-06-29
 * @since 1.0.0
 * *
 */
public class AutorAgregado extends DomainEvent {
    private final IdAutor entityId;
    private final Nombre nombre;

    public AutorAgregado(IdAutor entityId, Nombre nombre) {
        super("co.sofka.com.libro.AutorAgregado");
        this.entityId = entityId;
        this.nombre = nombre;
    }

    public IdAutor idautor() {
        return entityId;
    }

    public Nombre nombre() {
        return nombre;
    }
}
