package co.sofka.com.prestamo.commands;

import co.com.sofka.domain.generic.Command;
import co.sofka.com.prestamo.entities.Cliente;

public class asociarClienteCommand extends Command {
    private final Cliente cliente;


    public asociarClienteCommand(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
