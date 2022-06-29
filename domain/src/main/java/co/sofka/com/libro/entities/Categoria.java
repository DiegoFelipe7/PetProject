package co.sofka.com.libro.entities;

import co.com.sofka.domain.generic.Entity;
import co.sofka.com.libro.values.CategoriaLibro;
import co.sofka.com.libro.values.IdCategoria;
import co.sofka.com.libro.values.Nombre;

public class Categoria extends Entity<IdCategoria> {
    protected CategoriaLibro categoria;
    public Categoria(IdCategoria entityId , CategoriaLibro categoria) {
        super(entityId);
        this.categoria=categoria;
    }

    public void agregarNombre(Nombre nombre){

    }
}
