package co.sofka.com.biblioteca.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.sofka.com.biblioteca.entities.Bibliotecario;
import co.sofka.com.biblioteca.values.BibliotecarioId;
import co.sofka.com.valuesgeneric.Nombre;

public class BibliotecaCreada extends DomainEvent {

    private final BibliotecarioId bibliotecarioId;

    public BibliotecaCreada(BibliotecarioId bibliotecarioId){
        super("co.sofka.com.biblioteca.bibliotecacreada");
        this.bibliotecarioId = bibliotecarioId;
    }

    public BibliotecarioId bibliotecarioId(){
        return bibliotecarioId;
    }
}
