package co.sofka.com.libro;

import co.com.sofka.domain.generic.EventChange;
import co.sofka.com.libro.entities.Autor;
import co.sofka.com.libro.entities.Categoria;
import co.sofka.com.libro.events.AutorAgregado;
import co.sofka.com.libro.events.CategoriaAgregada;
import co.sofka.com.libro.events.LibroCreado;

import java.util.HashSet;

/**
 * EvenChangue  Libro para el manejo de enventos
 *
 * @Version 1.0
 * @Author Diego Felipe Muñoz Mosquera
 * @Email diegofelipem99@gmail.com
 * *
 */
public class LibroEventChange extends EventChange {
    public LibroEventChange(Libro libro) {
        apply((LibroCreado event) -> {
            libro.titulo = event.titulo();
            libro.fecha = event.fecha();
            libro.autor = new HashSet<>();
            libro.categoria = new HashSet<>();
        });

        apply((AutorAgregado event) -> {
            libro.autor.add(new Autor(event.idautor(), event.nombre()));
        });

        apply((CategoriaAgregada event) -> {
            libro.categoria.add(new Categoria(event.getIdCategoria(), event.getCategoria()));
        });


    }
}
