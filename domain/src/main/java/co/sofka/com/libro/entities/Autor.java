package co.sofka.com.libro.entities;

import co.sofka.com.libro.values.IdAutor;
import co.com.sofka.domain.generic.Entity;
import co.sofka.com.valuesgeneric.Nombre;
/**
 * Entidad autor
 *
 * @author Diego Felipe Muñoz <diegofelipem99@gmail.com>
 * @version 1.0.0 2022-06-29
 * @since 1.0.0
 * *
 */
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
