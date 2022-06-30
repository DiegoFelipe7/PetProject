package co.sofka.com.libro;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.sofka.com.libro.entities.Autor;
import co.sofka.com.libro.entities.Categoria;
import co.sofka.com.libro.events.AutorAgregado;
import co.sofka.com.libro.events.CategoriaAgregada;
import co.sofka.com.libro.events.LibroCreado;
import co.sofka.com.libro.values.*;
import co.sofka.com.valuesgeneric.Nombre;

import java.util.List;
import java.util.Objects;
import java.util.Set;

/**
 * Agregado  raiz  Libro
 *
 * @author Diego Felipe Muñoz <diegofelipem99@gmail.com>
 * @version 1.0.0 2022-06-29
 * @since 1.0.0
 * *
 */
public class Libro extends AggregateEvent<IdLibro> {
    protected Titulo titulo;

    protected Fecha fecha;
    protected Set<Autor> autor;
    protected Set<Categoria> categoria;


    public Libro(IdLibro entityId, Titulo titulo, Fecha fecha) {
        super(entityId);
        appendChange(new LibroCreado(titulo, fecha)).apply();
    }

    public Libro(IdLibro idLibro) {
        super(idLibro);
        subscribe(new LibroEventChange(this));
    }

    public static Libro libro(IdLibro idLibro, List<DomainEvent> events) {
        var libro = new Libro(idLibro);
        events.forEach(libro::applyEvent);
        return libro;
    }

    public void agregarAutor(IdAutor entityId, Nombre nombre) {
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(nombre);
        appendChange(new AutorAgregado(entityId, nombre));
    }

    public void agregarCategoria(IdCategoria entityId, CategoriaLibro categoria) {
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(categoria);
        appendChange(new CategoriaAgregada(entityId, categoria));
    }


    public Titulo titulo() {
        return titulo;
    }

    public Fecha fecha() {
        return fecha;
    }

    public Set<Autor> autor() {
        return autor;
    }

    public Set<Categoria> categoria() {
        return categoria;
    }

}
