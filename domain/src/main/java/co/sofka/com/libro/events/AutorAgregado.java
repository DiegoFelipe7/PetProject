package co.sofka.com.libro.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.sofka.com.libro.values.IdAutor;
import co.sofka.com.valuesgeneric.Nombre;

public class AutorAgregado extends DomainEvent {
    private final IdAutor entityId;
    private final Nombre nombre;
    public AutorAgregado(IdAutor entityId , Nombre nombre){
        super("sofka.autor.AutorAgregado");
        this.entityId=entityId;
        this.nombre=nombre;
    }

    public IdAutor getIdautor(){
        return entityId;
    }

    public Nombre getNombre(){
        return nombre;
    }
}
