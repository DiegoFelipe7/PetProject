package co.sofka.com.prestamo.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Edad implements ValueObject<Integer> {
    private final int age;

    public Edad(int age) {
        if (age < 10) {
            throw new IllegalArgumentException("La edad para prestamos debe ser mayor a 10 ");
        } else {
            this.age = age;
        }
    }

    @Override
    public Integer value() {
        return this.age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Edad edad = (Edad) o;
        return age == edad.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }
}
