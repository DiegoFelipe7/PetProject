package co.sofka.com.libro.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Nombre implements ValueObject<String > {
    private final String nombre;

    public Nombre(String nombre) {
        this.nombre = Objects.requireNonNull(nombre);
        if(this.nombre.equals("")){
            throw  new IllegalArgumentException("No se permiten vacios");
        }
    }

    @Override
    public String value() {
        return nombre;
    }
}
