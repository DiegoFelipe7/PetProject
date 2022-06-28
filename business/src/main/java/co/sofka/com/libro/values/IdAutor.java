package co.sofka.com.libro.values;

import co.com.sofka.domain.generic.Identity;

public class IdAutor extends Identity {
    public IdAutor(String uuid) {
        super(uuid);
    }
    public static IdAutor of(String uuid) {
        return new IdAutor(uuid);
    }
}
