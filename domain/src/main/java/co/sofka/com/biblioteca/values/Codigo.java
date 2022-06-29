package co.sofka.com.biblioteca.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Codigo implements ValueObject<String> {

    private final String value;

    public Codigo(String value){
        this.value = Objects.requireNonNull(value);
        if (this.value.isEmpty()){
            throw new IllegalArgumentException("El codigo de la seccion no puede estar vacio");
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
        Codigo codigo = (Codigo) o;
        return Objects.equals(value, codigo.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
