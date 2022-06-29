package co.sofka.com.prestamo.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.sofka.com.prestamo.Prestamo;
import co.sofka.com.prestamo.commands.ActualizarEstadoDelRegistroPrestamoCommand;
/**
 * @author  Juan Ignacio Ramallo
 * @version 1.0.0
 * Driven domain design -  Caso de uso para actualizar el estado en un prestamo.
 */
public class ActualizarEstadoRegistroPrestamoUseCase extends UseCase<RequestCommand<ActualizarEstadoDelRegistroPrestamoCommand>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<ActualizarEstadoDelRegistroPrestamoCommand> actualizarEstadoDelRegistroPrestamoCommandRequestCommand) {
        var command = actualizarEstadoDelRegistroPrestamoCommandRequestCommand.getCommand();
        var prestamo = Prestamo.from(command.getPrestamoId(), repository().getEventsBy(command.getPrestamoId().value()));
        prestamo.actualizarEstadoDelRegistroPrestamo(command.getPrestamoId(), command.getRegistroPrestamoId(), command.getEstadoPrestamo());
        emit().onResponse(new ResponseEvents(prestamo.getUncommittedChanges()));
    }
}
