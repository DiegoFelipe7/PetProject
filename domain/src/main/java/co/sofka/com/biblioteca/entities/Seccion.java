package co.sofka.com.biblioteca.entities;

import co.com.sofka.domain.generic.Entity;
import co.sofka.com.biblioteca.values.Codigo;
import co.sofka.com.biblioteca.values.SeccionId;
import co.sofka.com.biblioteca.values.Ubicacion;

/**
 * Entidad Seccion
 *
 * @author Ricardo Ortega <tattortega.28@gmail.com>
 * @version 1.0.0 2022-06-29
 * @since 1.0.0
 */
public class Seccion extends Entity<SeccionId> {

    private Ubicacion ubicacion;
    private Codigo codigo;

    public Seccion(SeccionId seccionId, Ubicacion ubicacion, Codigo codigo) {
        super(seccionId);
        this.ubicacion = ubicacion;
        this.codigo = codigo;
    }

    public void crearUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Ubicacion ubicacion() {
        return ubicacion;
    }

    public Codigo codigo() {
        return codigo;
    }
}
