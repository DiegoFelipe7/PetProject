package co.sofka.com.prestamo.entities;

import co.com.sofka.domain.generic.Entity;
import co.sofka.com.prestamo.values.ClienteId;
import co.sofka.com.prestamo.values.Edad;
import co.sofka.com.prestamo.values.Nombre;

public class Cliente extends Entity<ClienteId> {
    private Nombre nombre;
    private Edad edad;

    public Cliente(ClienteId id, Nombre nombre, Edad edad) {
        super(id);
        this.nombre = nombre;
        this.edad = edad;


    }



}
