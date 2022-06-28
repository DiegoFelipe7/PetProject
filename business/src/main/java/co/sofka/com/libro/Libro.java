package co.sofka.com.libro;

import co.com.sofka.domain.generic.AggregateEvent;
import co.sofka.com.libro.values.*;

import java.util.Set;

public class Libro extends AggregateEvent<IdLibro> {
    protected Set<IdAutor>  idautor;
    protected Set<IdCategoria> idcategoria;
    protected Titulo titulo;
    protected Fecha fecha;

    public Libro(IdLibro entityId) {
        super(entityId);
    }
}
