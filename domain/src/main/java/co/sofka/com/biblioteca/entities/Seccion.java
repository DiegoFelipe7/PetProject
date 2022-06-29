package co.sofka.com.biblioteca.entities;

import co.com.sofka.domain.generic.Entity;
import co.sofka.com.biblioteca.values.Codigo;
import co.sofka.com.biblioteca.values.SeccionId;
import co.sofka.com.biblioteca.values.Ubicacion;

public class Seccion extends Entity<SeccionId> {

    private final Ubicacion ubicacion;
    private final Codigo codigo;

    public Seccion(SeccionId seccionId, Ubicacion ubicacion, Codigo codigo){
        super(seccionId);
        this.ubicacion = ubicacion;
        this.codigo = codigo;
    }

    public Ubicacion ubicacion() {
        return ubicacion;
    }

    public Codigo codigo() {
        return codigo;
    }
}
