package co.sofka.com.libro.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.sofka.com.libro.values.Titulo;

public class TituloAgregado extends DomainEvent {
    private final Titulo titulo;


    public TituloAgregado(Titulo titulo){
        super("libro.TituloAgregado");
        this.titulo=titulo;

    }

    public Titulo getTituloAgregado(){
        return titulo;
    }
}
