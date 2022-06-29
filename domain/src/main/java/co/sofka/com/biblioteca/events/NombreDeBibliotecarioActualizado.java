package co.sofka.com.biblioteca.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.sofka.com.valuesgeneric.Nombre;

public class NombreDeBibliotecarioActualizado extends DomainEvent {

    private final Nombre nombre;

    public NombreDeBibliotecarioActualizado(Nombre nombre){
        super("co.sofka.com.biblioteca.nombredebibliotecarioactualizado");
        this.nombre = nombre;
    }

    public Nombre nombre() {
        return nombre;
    }
}
