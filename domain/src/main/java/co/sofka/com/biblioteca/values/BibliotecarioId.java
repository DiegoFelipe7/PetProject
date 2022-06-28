package co.sofka.com.biblioteca.values;

import co.com.sofka.domain.generic.Identity;

public class BibliotecarioId extends Identity {

    public BibliotecarioId(){

    }

    public BibliotecarioId(String uuid){
        super(uuid);
    }

    public BibliotecarioId of(String uuid){
        return new BibliotecarioId(uuid);
    }
}
