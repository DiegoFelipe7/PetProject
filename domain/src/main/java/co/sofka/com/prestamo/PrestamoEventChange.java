package co.sofka.com.prestamo;

import co.com.sofka.domain.generic.EventChange;

import co.sofka.com.prestamo.events.*;


public class PrestamoEventChange extends EventChange {
    private static final String MSG = "El prestamo no ha sido creado";

    public PrestamoEventChange(Prestamo prestamo) {
        apply((NuevoPrestamoCreado event) ->
                prestamo.fecha = event.getFecha()
        );
        apply((ClienteAsociadoAprestamo event) -> {
            if (!prestamo.identity().equals(event.getPrestamoId())) {
                throw new IllegalArgumentException(MSG);
            }
            prestamo.cliente = event.getCliente();

        });
        apply((RegistroAsociadoAprestamo event) -> {
            if (!prestamo.identity().equals(event.getPrestamoId())) {
                throw new IllegalArgumentException(MSG);
            }
            prestamo.registroPrestamo = event.getRegistro();
        });
        apply((LibroAgregado event) -> {
            if (!prestamo.identity().equals(event.getPrestamoId())) {
                throw new IllegalArgumentException(MSG);
            }
            prestamo.libroId = event.getIdLibro();
        });
        apply((BibliotecaAgregada event) -> {
            if (!prestamo.identity().equals(event.getPrestamoId())) {
                throw new IllegalArgumentException(MSG);
            }
            prestamo.bibliotecaId = event.getId();
        });

        apply((CambioDeEstadoEnRegistro event) -> {
            if (!prestamo.identity().equals(event.getPrestamoId())) {
                throw new IllegalArgumentException(MSG);

            }
            prestamo.registroPrestamo.actualizarEstadoDelPrestamo(event.getEstadoPrestamo().value());
        });
    }
}
