package co.sofka.com.prestamo;

import co.com.sofka.domain.generic.EventChange;

import co.sofka.com.prestamo.events.*;


public class PrestamoEventChange extends EventChange {
    public PrestamoEventChange(Prestamo prestamo) {
        apply((ClienteAsociadoAprestamo event) -> {
            prestamo.cliente = event.getCliente();

        });
        apply((RegistroAsociadoAprestamo event) -> {
            prestamo.registroPrestamo= event.getRegistro();
        });
        apply((LibroAgregado event)->{
            prestamo.libroId= event.getIdLibro();
        });
        apply((BibliotecaAgregada event)->{
            prestamo.bibliotecaId= event.getId();
        });
    }
}
