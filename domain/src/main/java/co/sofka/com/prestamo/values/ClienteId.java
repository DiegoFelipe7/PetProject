package co.sofka.com.prestamo.values;

import co.com.sofka.domain.generic.Identity;


public class ClienteId extends Identity {

    public ClienteId() {
    }

    public ClienteId(String uuid) {
        super(uuid);
    }

    public ClienteId of(String uuid) {
        return new ClienteId(uuid);
    }

}
