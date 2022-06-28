package co.sofka.com.libro.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.sofka.com.libro.values.Titulo;

public class AutorAgregado extends DomainEvent {
    private Titulo titulo;


    public AutorAgregado(Titulo titulo){
        super("libro.AutorAgregado");
        this.titulo=titulo;

    }

    public Titulo getAutorAgregado(){
        return titulo;
    }
}
