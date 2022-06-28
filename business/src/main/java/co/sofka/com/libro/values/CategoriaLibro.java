package co.sofka.com.libro.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class CategoriaLibro implements ValueObject<String> {
    private final String categoria;

    public CategoriaLibro(String categoria) {
        this.categoria = Objects.requireNonNull(categoria);
        if (this.categoria.equals("")) {
            throw new IllegalArgumentException("No se permiten vacios");
        }
    }


    @Override
    public String value() {
        return categoria;
    }
}
