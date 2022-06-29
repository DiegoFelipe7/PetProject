package co.sofka.com.libro.entities;

import co.sofka.com.libro.values.IdAutor;
import co.com.sofka.domain.generic.Entity;
import co.sofka.com.valuesgeneric.Nombre;

public class Autor  extends Entity<IdAutor> {
    protected Nombre nombre;
    public Autor(IdAutor entityId , Nombre nombre) {
        super(entityId);
        this.nombre=nombre;
    }

    public void AgregarNombre(Nombre nombre){
        this.nombre=nombre;
    }


}
