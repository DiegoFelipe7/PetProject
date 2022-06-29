package co.sofka.com.biblioteca.values;

import co.com.sofka.domain.generic.Identity;

public class SeccionId extends Identity {

    public SeccionId(){

    }

    private SeccionId(String uuid){
        super(uuid);
    }

    public static SeccionId of(String uuid){
        return new SeccionId(uuid);
    }
}
