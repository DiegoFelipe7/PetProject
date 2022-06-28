package co.sofka.com.libro.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Titulo implements ValueObject<String> {
    private final String titulo;

    public Titulo(String titulo) {
        this.titulo = Objects.requireNonNull(titulo);
        if(this.titulo.equals("")){
            throw new IllegalArgumentException("No se permiten vacios");
        }
    }

    @Override
    public String value() {
        return titulo;
    }
}
