package co.sofka.com.prestamo.values;

import co.com.sofka.domain.generic.ValueObject;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Fecha implements ValueObject<String> {
    private final LocalDate value;
    private final String format;

    public Fecha(LocalDate fecha) {
        this.value = LocalDate.now();
        this.format = value.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
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
        return Objects.hash(format);
    }

    @Override
    public String value() {
        return format;
    }
}
