package co.sofka.com.libro.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Nombre implements ValueObject<String > {
    private final String value;

    public Nombre(String nombre) {
        this.value = Objects.requireNonNull(nombre);
        if(this.value.equals("")){
            throw  new IllegalArgumentException("No se permiten vacios");
        }
    }

    @Override
    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nombre nombre = (Nombre) o;
        return Objects.equals(value, nombre.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
