package co.sofka.com.biblioteca.values;

import co.com.sofka.domain.generic.Identity;

public class BibliotecaId extends Identity {

    public BibliotecaId(){

    }

    public BibliotecaId(String uuid){
        super(uuid);
    }

    public static BibliotecaId of(String uuid){
        return new BibliotecaId(uuid);
    }
}
