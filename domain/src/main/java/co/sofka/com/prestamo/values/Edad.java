package co.sofka.com.prestamo.values;

import co.com.sofka.domain.generic.ValueObject;

public class Edad implements ValueObject<Integer> {
    private final int edad;

    public Edad(int edad) {
        if(edad < 10){
            throw new IllegalArgumentException("La edad para prestamos debe ser mayor a 10 ");
        }else{
            this.edad = edad;
        }
    }

    @Override
    public Integer value() {
        return this.edad;
    }
}
