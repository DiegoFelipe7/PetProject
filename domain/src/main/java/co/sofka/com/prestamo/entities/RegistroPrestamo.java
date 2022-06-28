package co.sofka.com.prestamo.entities;

import co.com.sofka.domain.generic.Entity;
import co.sofka.com.prestamo.values.EstadoPrestamo;
import co.sofka.com.prestamo.values.RegistroPrestamoId;

public class RegistroPrestamo extends Entity<RegistroPrestamoId> {
    private EstadoPrestamo estadoPrestamo;

    public RegistroPrestamo(RegistroPrestamoId id, EstadoPrestamo estadoPrestamo) {
        super(id);
        this.estadoPrestamo = estadoPrestamo;
    }

    public void actualizarEstadoDelPrestamo(String estadoNuevo){
        this.estadoPrestamo  = estadoPrestamo.cambiarEstado(estadoNuevo);
    }



}
