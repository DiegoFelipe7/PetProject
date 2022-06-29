package co.sofka.com.libro.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.sofka.com.libro.values.Fecha;
import co.sofka.com.libro.values.Titulo;
/**
 * DomainEvent  LibroCreado
 *
 * @author Diego Felipe Muñoz <diegofelipem99@gmail.com>
 * @version 1.0.0 2022-06-29
 * @since 1.0.0
 * *
 */
public class LibroCreado extends DomainEvent {

    private final Titulo titulo;
    private final Fecha fecha;

    public LibroCreado(Titulo titulo, Fecha fecha){
        super("co.sofka.com.libro.LibroCreado");
        this.titulo=titulo;
        this.fecha=fecha;
    }
    public Titulo titulo(){
        return titulo;
    }

    public Fecha fecha(){
        return fecha;
    }

}
