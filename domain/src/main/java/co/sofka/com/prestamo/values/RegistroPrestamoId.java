package co.sofka.com.prestamo.values;

import co.com.sofka.domain.generic.Identity;

public class RegistroPrestamoId extends Identity {

    public RegistroPrestamoId() {

    }

    public RegistroPrestamoId(String uuid) {
        super(uuid);
    }

    public RegistroPrestamoId of(String uuid) {
        return new RegistroPrestamoId(uuid);
    }
}
