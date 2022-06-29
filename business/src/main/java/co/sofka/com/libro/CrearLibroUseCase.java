package co.sofka.com.libro;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
public class CrearLibroUseCase extends UseCase<RequestCommand<Crea>, ResponseEvents> {

    public void EjecutarCaso(RequestCommand<> crearPasajeroRequest){
        var command= crearPasajeroRequest.getCommand();
        var Libro = new Libro(
                command.get
        );
        emit().onResponse(new ResponseEvents(libro.));
    }
}
