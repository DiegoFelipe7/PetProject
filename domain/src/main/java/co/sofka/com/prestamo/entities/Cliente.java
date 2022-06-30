package co.sofka.com.prestamo.entities;

import co.com.sofka.domain.generic.Entity;
import co.sofka.com.prestamo.values.ClienteId;
import co.sofka.com.prestamo.values.Edad;
import co.sofka.com.valuesgeneric.Nombre;

/**
 * @author Juan Ignacio Ramallo
 * @version 1.0.0
 * Driven domain design -  Entidad con sus atributos y comportamientos
 */
public class Cliente extends Entity<ClienteId> {
    private Nombre nombre;
    private Edad edad;

    public Cliente(ClienteId id, Nombre nombre, Edad edad) {
        super(id);
        this.nombre = nombre;
        this.edad = edad;
    }

    public Edad edad() {
        return this.edad;
    }

    public Nombre nombre() {
        return this.nombre;
    }

    public void actualizarNombre(Nombre nombre) {
        this.nombre = nombre;
    }


}
