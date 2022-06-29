package co.sofka.com.libro.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.sofka.com.libro.Libro;
import co.sofka.com.libro.commands.CrearLibroCommand;
import co.sofka.com.libro.values.IdLibro;

public class CrearLibroUseCase extends UseCase<RequestCommand<CrearLibroCommand>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearLibroCommand> crearLibroRequest ){
        var command = crearLibroRequest.getCommand();
        var libro = new Libro(new IdLibro());
        emit().onResponse(new ResponseEvents(libro.getUncommittedChanges()));

    }
}
