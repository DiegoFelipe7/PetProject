package co.sofka.com.libro;

import co.com.sofka.domain.generic.AggregateEvent;
import co.sofka.com.libro.entities.Categoria;
import co.sofka.com.libro.events.FechaAgregada;
import co.sofka.com.libro.events.TituloAgregado;
import co.sofka.com.libro.values.*;

import java.util.Objects;
import java.util.Set;

public class Libro extends AggregateEvent<IdLibro> {
    protected Set<IdAutor>  idautor;
    protected Set<Categoria> categoria;
    protected Titulo titulo;
    protected Fecha fecha;

    public Libro(IdLibro entityId , Titulo titulo,Fecha fecha) {
        super(entityId);
        appendChange(new TituloAgregado(titulo)).apply();
        appendChange(new FechaAgregada(fecha)).apply();
    }

    public void agregarAutor(IdAutor entityId , Nombre nombre){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(nombre);
        //appendChange(new AutorAgregado(entityId,nombre));
    }
}
