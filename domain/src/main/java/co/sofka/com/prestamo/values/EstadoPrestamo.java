package co.sofka.com.prestamo.values;

import co.com.sofka.domain.generic.ValueObject;


import java.util.Objects;

public class EstadoPrestamo implements ValueObject<String> {
    private final String estado;


    public EstadoPrestamo(String estado) {
        this.estado = Objects.requireNonNull(estado);
    }

    public EstadoPrestamo cambiarEstado(String estado) {
        return new EstadoPrestamo(estado);
    }


    @Override
    public String value() {
        return this.estado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EstadoPrestamo that = (EstadoPrestamo) o;
        return Objects.equals(estado, that.estado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(estado);
    }
}
