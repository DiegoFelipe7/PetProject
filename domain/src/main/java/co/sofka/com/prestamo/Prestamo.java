package co.sofka.com.prestamo;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.sofka.com.biblioteca.entities.Biblioteca;
import co.sofka.com.biblioteca.values.BibliotecaId;
import co.sofka.com.prestamo.values.Fecha;
import co.sofka.com.libro.values.IdLibro;
import co.sofka.com.prestamo.entities.Cliente;
import co.sofka.com.prestamo.entities.RegistroPrestamo;
import co.sofka.com.prestamo.events.*;
import co.sofka.com.prestamo.values.DiasPrestado;
import co.sofka.com.prestamo.values.PrestamoId;

import java.util.List;
import java.util.Objects;

public class Prestamo extends AggregateEvent<PrestamoId>{
    protected IdLibro libroId;
    protected BibliotecaId bibliotecaId;
    protected Cliente cliente;
    protected RegistroPrestamo registroPrestamo;
    protected  Fecha fecha;
    protected DiasPrestado diasPrestado;

    public Prestamo(PrestamoId id, Fecha fecha) {

        super(id);
        appendChange(new NuevoPrestamoCreado(id, fecha)).apply();
        subscribe(new  PrestamoEventChange(this));
    }

    public Prestamo(PrestamoId prestamoId){
        super(prestamoId);
        subscribe(new PrestamoEventChange(this));
    }
    public static Prestamo from(PrestamoId prestamoId, List<DomainEvent> events){
        var prestamo = new Prestamo(prestamoId);
        events.forEach(prestamo::applyEvent);
        return prestamo;
    }

    public void agregarLibro(IdLibro idLibro){
        Objects.requireNonNull(idLibro);
        appendChange(new LibroAgregado(idLibro)).apply();


    }
    public void agregarBiblioteca(BibliotecaId id){
        Objects.requireNonNull(id);
        appendChange(new BibliotecaAgregada(id)).apply();
    }

    public void asociarClienteAprestamo(Cliente cliente){
        Objects.requireNonNull( cliente);
        appendChange(new ClienteAsociadoAprestamo(cliente)).apply();
    }

    public void asociarRegistroAprestamo(RegistroPrestamo registro){
        Objects.requireNonNull( registro);
        appendChange(new RegistroAsociadoAprestamo(registro)).apply();
    }


}
