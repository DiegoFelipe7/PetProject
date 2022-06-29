package co.sofka.com.libro.entities;

import co.sofka.com.libro.values.IdAutor;
import co.sofka.com.libro.values.Nombre;
import co.com.sofka.domain.generic.Entity;

public class Autor  extends Entity<IdAutor> {
    protected Nombre nombre;
    public Autor(IdAutor entityId , Nombre nombre) {
        super(entityId);
        this.nombre=nombre;
    }
}
