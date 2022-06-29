package co.sofka.com.biblioteca.commands;

import co.com.sofka.domain.generic.Command;
import co.sofka.com.biblioteca.entities.Seccion;
import co.sofka.com.biblioteca.values.BibliotecaId;
import co.sofka.com.biblioteca.values.SeccionId;
import co.sofka.com.biblioteca.values.Ubicacion;

/**
 * Comando para agregar Seccion a la Biblioteca
 *
 * @author Ricardo Ortega <tattortega.28@gmail.com>
 * @version 1.0.0 2022-06-29
 * @since 1.0.0
 */
public class AgregarSeccion extends Command {

    private final BibliotecaId bibliotecaId;
    private final SeccionId seccionId;
    private final Ubicacion ubicacion;
    private final Seccion seccion;

    public AgregarSeccion(BibliotecaId bibliotecaId, SeccionId seccionId, Ubicacion ubicacion, Seccion seccion) {
        this.bibliotecaId = bibliotecaId;
        this.seccionId = seccionId;
        this.ubicacion = ubicacion;
        this.seccion = seccion;
    }

    public BibliotecaId bibliotecaId() {
        return bibliotecaId;
    }

    public SeccionId seccionId() {
        return seccionId;
    }

    public Ubicacion ubicacion() {
        return ubicacion;
    }

    public Seccion seccion() {
        return seccion;
    }
}
