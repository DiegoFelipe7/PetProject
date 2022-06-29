package co.sofka.com.biblioteca.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.sofka.com.biblioteca.values.Codigo;
import co.sofka.com.biblioteca.values.SeccionId;
import co.sofka.com.biblioteca.values.Ubicacion;

/**
 * Evento de dominio para agregar Seccion a Biblioteca
 *
 * @author Ricardo Ortega <tattortega.28@gmail.com>
 * @version 1.0.0 2022-06-29
 * @since 1.0.0
 */
public class SeccionAgregada extends DomainEvent {

    private final SeccionId seccionId;
    private final Ubicacion ubicacion;
    private final Codigo codigo;

    public SeccionAgregada(SeccionId seccionId, Ubicacion ubicacion, Codigo codigo) {
        super("co.sofka.com.biblioteca.seccionagregada");
        this.seccionId = seccionId;
        this.ubicacion = ubicacion;
        this.codigo = codigo;
    }

    public SeccionId seccionId() {
        return seccionId;
    }

    public Ubicacion ubicacion() {
        return ubicacion;
    }

    public Codigo codigo() {
        return codigo;
    }
}
