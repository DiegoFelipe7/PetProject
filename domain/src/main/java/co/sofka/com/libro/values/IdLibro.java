package co.sofka.com.libro.values;

import co.com.sofka.domain.generic.Identity;

public class IdLibro extends Identity {

    public IdLibro(){

    }
    public IdLibro(String uuid){
        super(uuid);
    }


    public static IdLibro of(String uuid) {
        return new IdLibro(uuid);
    }


}
