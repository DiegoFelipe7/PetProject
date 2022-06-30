package co.sofka.com.prestamo;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import co.sofka.com.biblioteca.values.BibliotecaId;
import co.sofka.com.prestamo.values.*;
import co.sofka.com.libro.values.IdLibro;
import co.sofka.com.prestamo.entities.Cliente;
import co.sofka.com.prestamo.entities.RegistroPrestamo;
import co.sofka.com.prestamo.events.*;

import java.util.List;



/**
 * @author  Juan Ignacio Ramallo
 * @version 1.0.0
 * Driven domain design -  Agregado root con sus atributos, y comportamientos.
 */
public class Prestamo extends AggregateEvent<PrestamoId>{

    protected IdLibro libroId;
    protected BibliotecaId bibliotecaId;
    protected Cliente cliente;
    protected RegistroPrestamo registroPrestamo;
    protected  Fecha fecha;
    protected DiasPrestado diasPrestado;

    public Prestamo(PrestamoId id, Fecha fecha) {

        super(id);
        appendChange(new NuevoPrestamoCreado(fecha)).apply();
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

    public void agregarLibro( PrestamoId prestamoId, IdLibro idLibro){

        appendChange(new LibroAgregado(prestamoId,idLibro)).apply();


    }
    public void agregarBiblioteca(PrestamoId prestamoId, BibliotecaId id){

        appendChange(new BibliotecaAgregada(prestamoId, id)).apply();
    }

    public void asociarClienteAprestamo(PrestamoId prestamoId, Cliente cliente){

        appendChange(new ClienteAsociadoAprestamo(prestamoId, cliente)).apply();
    }

    public void asociarRegistroAprestamo(PrestamoId prestamoId, RegistroPrestamo registro){

        appendChange(new RegistroAsociadoAprestamo(prestamoId, registro)).apply();
    }
    public void actualizarEstadoDelRegistroPrestamo(PrestamoId prestamoId, RegistroPrestamoId registroPrestamoId, EstadoPrestamo estadoPrestamo){
        appendChange(new CambioDeEstadoEnRegistro(prestamoId, registroPrestamoId,estadoPrestamo)).apply();

    }



}
