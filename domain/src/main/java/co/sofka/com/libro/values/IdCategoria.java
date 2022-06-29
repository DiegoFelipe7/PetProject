package co.sofka.com.libro.values;

import co.com.sofka.domain.generic.Identity;

public class IdCategoria extends Identity {
    public IdCategoria(String uuid){
            super(uuid);
    }
    public static IdCategoria of(String uuid) {
        return new IdCategoria(uuid);
    }
}
