package co.sofka.com.prestamo.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.sofka.com.prestamo.entities.Cliente;
import co.sofka.com.prestamo.values.PrestamoId;

/**
 * @author Juan Ignacio Ramallo
 * @version 1.0.0
 * Driven domain design -  Evento de dominio cliente asociado al prestamo.
 */
public class ClienteAsociadoAprestamo extends DomainEvent {
    private final PrestamoId prestamoId;
    private final Cliente cliente;

    public ClienteAsociadoAprestamo(PrestamoId prestamoId, Cliente cliente) {
        super("co.sofka.com.prestamo.ClienteAsociadoAprestamo");
        this.prestamoId = prestamoId;
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public PrestamoId getPrestamoId() {
        return prestamoId;
    }
}
