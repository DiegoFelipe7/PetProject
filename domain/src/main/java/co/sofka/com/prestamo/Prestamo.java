package co.sofka.com.prestamo;

import co.com.sofka.domain.generic.AggregateEvent;
import co.sofka.com.prestamo.values.PrestamoId;

public class Prestamo extends AggregateEvent<PrestamoId>{


    public Prestamo(PrestamoId id) {
        super(id);
    }
}
