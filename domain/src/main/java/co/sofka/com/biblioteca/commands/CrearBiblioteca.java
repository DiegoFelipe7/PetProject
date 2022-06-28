package co.sofka.com.biblioteca.commands;

import co.com.sofka.domain.generic.Command;
import co.sofka.com.biblioteca.values.BibliotecaId;

public class CrearBiblioteca extends Command {

    private final BibliotecaId bibliotecaId;

    public CrearBiblioteca(BibliotecaId bibliotecaId){
        this.bibliotecaId = bibliotecaId;
    }

    public BibliotecaId bibliotecaId() {
        return bibliotecaId;
    }
}
