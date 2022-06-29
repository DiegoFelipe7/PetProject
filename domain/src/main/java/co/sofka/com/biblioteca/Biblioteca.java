package co.sofka.com.biblioteca;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.sofka.com.biblioteca.entities.Bibliotecario;
import co.sofka.com.biblioteca.entities.Seccion;
import co.sofka.com.biblioteca.events.BibliotecaCreada;
import co.sofka.com.biblioteca.events.BibliotecarioAgregado;
import co.sofka.com.biblioteca.events.NombreDeBibliotecarioActualizado;
import co.sofka.com.biblioteca.events.SeccionAgregada;
import co.sofka.com.biblioteca.values.BibliotecaId;
import co.sofka.com.biblioteca.values.BibliotecarioId;
import co.sofka.com.biblioteca.values.Codigo;
import co.sofka.com.biblioteca.values.SeccionId;
import co.sofka.com.biblioteca.values.Ubicacion;
import co.sofka.com.valuesgeneric.Nombre;

import java.util.List;
import java.util.Objects;

/**
 * Agregado raiz para Biblioteca
 *
 * @author Ricardo Ortega <tattortega.28@gmail.com>
 * @version 1.0.0 2022-06-29
 * @since 1.0.0
 */
public class Biblioteca extends AggregateEvent<BibliotecaId> {

    protected BibliotecarioId bibliotecarioId;
    protected Bibliotecario bibliotecario;
    protected Seccion seccion;

    public Biblioteca(BibliotecaId bibliotecaId) {
        super(bibliotecaId);
        subscribe(new BibliotecaEventChange(this));
    }

    public Biblioteca(BibliotecaId bibliotecaId, BibliotecarioId bibliotecarioId) {
        super(bibliotecaId);
        appendChange(new BibliotecaCreada(bibliotecarioId)).apply();
        subscribe(new BibliotecaEventChange(this));
    }

    public static Biblioteca from(BibliotecaId bibliotecaId, List<DomainEvent> events) {
        var biblioteca = new Biblioteca(bibliotecaId);
        events.forEach(biblioteca::applyEvent);
        return biblioteca;
    }

    public void agregarBibliotecario(BibliotecarioId entityId, Nombre nombre) {
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(nombre);
        appendChange(new BibliotecarioAgregado(entityId, nombre)).apply();
    }

    public void actualizarNombreDeBibliotecario(Nombre nombre) {
        appendChange(new NombreDeBibliotecarioActualizado(nombre)).apply();
    }

    public void agregarSeccion(SeccionId seccionId, Ubicacion ubicacion, Codigo codigo) {
        Objects.requireNonNull(seccionId);
        Objects.requireNonNull(ubicacion);
        Objects.requireNonNull(codigo);
        appendChange(new SeccionAgregada(seccionId, ubicacion, codigo)).apply();
    }

    public void agregarBiblioteca(BibliotecarioId bibliotecarioId) {
        Objects.requireNonNull(bibliotecarioId);
        appendChange(new BibliotecaCreada(bibliotecarioId));
    }

    public Bibliotecario bibliotecario() {
        return bibliotecario;
    }

    public Seccion seccion() {
        return seccion;
    }
}
