package co.sofka.com.libro.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.sofka.com.libro.values.Fecha;
import co.sofka.com.libro.values.Titulo;

public class LibroCreado extends DomainEvent {
    private final Titulo titulo;
    private final Fecha fecha;

    public LibroCreado(Titulo titulo, Fecha fecha){
        super("sofka.libro.LibroCreado");
        this.titulo=titulo;
        this.fecha=fecha;
    }

    public Titulo titulo(){
        return titulo;
    }

    public Fecha fecha(){
        return fecha;
    }

}
