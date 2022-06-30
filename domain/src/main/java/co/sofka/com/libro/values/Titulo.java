package co.sofka.com.libro.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

/**
 * Objeto de valor tipo String para titulo de un libro
 *
 * @author Diego Felipe Muñoz <diegofelipem99@gmail.com>
 * @version 1.0.0 2022-06-29
 * @since 1.0.0
 */
public class Titulo implements ValueObject<String> {
    private final String value;

    public Titulo(String titulo) {
        this.value = Objects.requireNonNull(titulo);
        if (this.value.equals("")) {
            throw new IllegalArgumentException("No se permiten vacios");
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
        Titulo titulo = (Titulo) o;
        return Objects.equals(value, titulo.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}

