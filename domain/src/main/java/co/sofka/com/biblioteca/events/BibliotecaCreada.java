package co.sofka.com.biblioteca.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.sofka.com.biblioteca.entities.Bibliotecario;
import co.sofka.com.valuesgeneric.Nombre;

public class BibliotecaCreada extends DomainEvent {

    private final Bibliotecario bibliotecario;

    public BibliotecaCreada(Bibliotecario bibliotecario){
        super("sofka.biblioteca.bibliotecacreada");
        this.bibliotecario = bibliotecario;
    }

    public Bibliotecario bibliotecario(){
        return bibliotecario;
    }
}
