package co.sofka.com.libro.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.sofka.com.libro.values.Fecha;
import co.sofka.com.libro.values.Titulo;

public class FechaAgregada extends DomainEvent {
    private final Fecha fecha;
    public FechaAgregada(Fecha fecha){
        super("libro.FechaAgregada");
        this.fecha=fecha;
    }

    public  Fecha getFechaAgregada(){
        return fecha;
    }
}
