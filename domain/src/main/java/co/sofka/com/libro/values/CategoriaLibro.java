package co.sofka.com.libro.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

/**
 * Objeto de valor tipo String para categoria de un libro
 *
 * @author Diego Felipe Muñoz <diegofelipem99@gmail.com>
 * @version 1.0.0 2022-06-29
 * @since 1.0.0
 */
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CategoriaLibro that = (CategoriaLibro) o;
        return Objects.equals(categoria, that.categoria);
    }

    @Override
    public int hashCode() {
        return Objects.hash(categoria);
    }
}
