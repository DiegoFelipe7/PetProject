package co.sofka.com.libro.commands;

import co.com.sofka.domain.generic.Command;
import co.sofka.com.libro.values.IdAutor;

public class AgregarAutor extends Command {
    private final IdAutor idAutor;

    public AgregarAutor(IdAutor idAutor ){
        this.idAutor=idAutor;
    }

    public IdAutor idAutor(){
        return idAutor;
    }
}
