package co.sofka.com.biblioteca.commands;

import co.com.sofka.domain.generic.Command;
import co.sofka.com.biblioteca.values.BibliotecaId;
import co.sofka.com.biblioteca.values.BibliotecarioId;

public class CrearBiblioteca extends Command {

    private final BibliotecaId bibliotecaId;
    private final BibliotecarioId bibliotecarioId;

    public CrearBiblioteca(BibliotecaId bibliotecaId, BibliotecarioId bibliotecarioId){
        this.bibliotecaId = bibliotecaId;
        this.bibliotecarioId = bibliotecarioId;
    }

    public BibliotecaId bibliotecaId() {
        return bibliotecaId;
    }

    public BibliotecarioId bibliotecarioId() {
        return bibliotecarioId;
    }
}
