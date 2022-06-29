package co.sofka.com.biblioteca.entities;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.sofka.com.biblioteca.events.BibliotecaCreada;
import co.sofka.com.biblioteca.events.BibliotecarioAgregado;
import co.sofka.com.biblioteca.events.NombreDeBibliotecarioActualizado;
import co.sofka.com.biblioteca.events.SeccionAgregada;
import co.sofka.com.biblioteca.values.*;
import co.sofka.com.valuesgeneric.Nombre;

import java.util.List;
import java.util.Objects;

public class Biblioteca extends AggregateEvent<BibliotecaId> {
    protected Bibliotecario bibliotecario;
    protected Seccion seccion;

    public Biblioteca(BibliotecaId bibliotecaId) {
        super(bibliotecaId);
    }

    public static Biblioteca from(BibliotecaId bibliotecaId, List<DomainEvent> events){
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

    public Bibliotecario bibliotecario() {
        return bibliotecario;
    }

    public Seccion seccion() {
        return seccion;
    }
}
