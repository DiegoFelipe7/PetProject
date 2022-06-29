package co.sofka.com.libro.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.sofka.com.libro.values.Titulo;

public class CategoriaAgregada extends DomainEvent {
    private final Titulo titulo;

    public CategoriaAgregada(Titulo titulo){
        super("libro.CategoriaAgregada");
        this.titulo = titulo;
    }
}
