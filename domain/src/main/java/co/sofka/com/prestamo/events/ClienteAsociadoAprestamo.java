package co.sofka.com.prestamo.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.sofka.com.prestamo.entities.Cliente;

public class ClienteAsociadoAprestamo extends DomainEvent {
    private final Cliente cliente;
    public ClienteAsociadoAprestamo(Cliente cliente) {
        super("co.sofka.com.prestamo.ClienteAsociadoAprestamo");
        this.cliente=cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
