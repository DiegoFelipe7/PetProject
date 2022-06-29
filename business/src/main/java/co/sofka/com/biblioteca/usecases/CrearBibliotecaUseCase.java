package co.sofka.com.biblioteca.usecases;


import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.sofka.com.biblioteca.commands.CrearBiblioteca;
import co.sofka.com.biblioteca.Biblioteca;

/**
 * Caso de uso para el evento crearBiblioteca
 *
 * @author Ricardo Ortega <tattortega.28@gmail.com>
 * @version 1.0.0 2022-06-29
 * @since 1.0.0
 */
public class CrearBibliotecaUseCase extends UseCase<RequestCommand<CrearBiblioteca>, ResponseEvents> {


    @Override
    public void executeUseCase(RequestCommand<CrearBiblioteca> crearBibliotecaRequestCommand) {
        var command = crearBibliotecaRequestCommand.getCommand();
        var biblioteca = new Biblioteca(command.bibliotecaId(), command.bibliotecarioId());
        emit().onResponse(new ResponseEvents(biblioteca.getUncommittedChanges()));
    }
}
