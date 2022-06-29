package co.sofka.com.libro.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.sofka.com.libro.Libro;
import co.sofka.com.libro.commands.CrearLibroCommand;
import co.sofka.com.libro.values.IdLibro;
/**
 * Caso de uso para el evento CrearLibro
 *
 * @author Diego Felipe Muñoz <diegofelipem99@gmail.com>
 * @version 1.0.0 2022-06-29
 * @since 1.0.0
 */
public class CrearLibroUseCase extends UseCase<RequestCommand<CrearLibroCommand>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearLibroCommand> crearLibroRequest ){
        var command = crearLibroRequest.getCommand();
        var libro = new Libro(command.idLibro(),command.titulo(),command.fecha());
        emit().onResponse(new ResponseEvents(libro.getUncommittedChanges()));

    }
}
