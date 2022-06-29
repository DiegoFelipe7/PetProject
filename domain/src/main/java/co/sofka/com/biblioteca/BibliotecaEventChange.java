package co.sofka.com.biblioteca;

import co.com.sofka.domain.generic.EventChange;
import co.sofka.com.biblioteca.entities.Bibliotecario;
import co.sofka.com.biblioteca.entities.Seccion;
import co.sofka.com.biblioteca.events.BibliotecaCreada;
import co.sofka.com.biblioteca.events.BibliotecarioAgregado;
import co.sofka.com.biblioteca.events.SeccionAgregada;

/**
 * Manejador de Eventos de Biblioteca
 *
 * @author Ricardo Ortega <tattortega.28@gmail.com>
 * @version 1.0.0 2022-06-29
 * @since 1.0.0
 */
public class BibliotecaEventChange extends EventChange {

    public BibliotecaEventChange(Biblioteca biblioteca) {
        apply((BibliotecaCreada event) -> {
            biblioteca.bibliotecarioId = event.bibliotecarioId();
        });

        apply((BibliotecarioAgregado event) -> {
            biblioteca.bibliotecario = new Bibliotecario(event.bibliotecarioId(), event.nombre());
        });

        apply((SeccionAgregada event) -> {
            biblioteca.seccion = new Seccion(event.seccionId(), event.ubicacion(), event.codigo());
        });
    }
}
