package co.sofka.com.libro.values;

import co.com.sofka.domain.generic.ValueObject;

import java.time.LocalDate;
import java.util.Objects;

/**
 * Objeto de valor tipo LocalDate para fecha de un libro
 *
 * @author Diego Felipe Muñoz <diegofelipem99@gmail.com>
 * @version 1.0.0 2022-06-29
 * @since 1.0.0
 */
public class Fecha implements ValueObject<LocalDate> {
    private final LocalDate value;

    public Fecha(LocalDate fecha) {
        this.value = LocalDate.now();
    }

    @Override
    public LocalDate value() {
        return value;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fecha fecha = (Fecha) o;
        return Objects.equals(value, fecha.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
