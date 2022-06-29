package co.sofka.com.biblioteca.commands;

import co.com.sofka.domain.generic.Command;
import co.sofka.com.biblioteca.values.BibliotecaId;
import co.sofka.com.valuesgeneric.Nombre;

public class ActualizarNombreDeBibliotecario extends Command {

    private final BibliotecaId bibliotecaId;
    private final Nombre nombre;

    public ActualizarNombreDeBibliotecario(BibliotecaId bibliotecaId, Nombre nombre){
        this.bibliotecaId = bibliotecaId;
        this.nombre = nombre;
    }

    public BibliotecaId bibliotecaId() {
        return bibliotecaId;
    }

    public Nombre nombre() {
        return nombre;
    }
}
