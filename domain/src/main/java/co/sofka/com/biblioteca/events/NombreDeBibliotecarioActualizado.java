package co.sofka.com.biblioteca.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.sofka.com.valuesgeneric.Nombre;

/**
 * Evento de dominio para actualizar nombre de Bilbiotecario
 *
 * @author Ricardo Ortega <tattortega.28@gmail.com>
 * @version 1.0.0 2022-06-29
 * @since 1.0.0
 */
public class NombreDeBibliotecarioActualizado extends DomainEvent {

    private final Nombre nombre;

    public NombreDeBibliotecarioActualizado(Nombre nombre) {
        super("co.sofka.com.biblioteca.nombredebibliotecarioactualizado");
        this.nombre = nombre;
    }

    public Nombre nombre() {
        return nombre;
    }
}
