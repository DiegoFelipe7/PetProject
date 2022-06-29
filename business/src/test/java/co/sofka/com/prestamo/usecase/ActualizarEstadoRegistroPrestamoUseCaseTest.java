package co.sofka.com.prestamo.usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import co.sofka.com.prestamo.Prestamo;
import co.sofka.com.prestamo.commands.ActualizarEstadoDelRegistroPrestamoCommand;
import co.sofka.com.prestamo.entities.RegistroPrestamo;
import co.sofka.com.prestamo.events.CambioDeEstadoEnRegistro;
import co.sofka.com.prestamo.events.NuevoPrestamoCreado;
import co.sofka.com.prestamo.events.RegistroAsociadoAprestamo;
import co.sofka.com.prestamo.values.EstadoPrestamo;
import co.sofka.com.prestamo.values.Fecha;
import co.sofka.com.prestamo.values.PrestamoId;
import co.sofka.com.prestamo.values.RegistroPrestamoId;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ActualizarEstadoRegistroPrestamoUseCaseTest {

    @Mock
    DomainEventRepository repository;
    @InjectMocks
    ActualizarEstadoRegistroPrestamoUseCase useCase;

    @Test
    public void actualizarEstadoDeRegistroTest(){
        //arrange
        Fecha fecha = new Fecha(LocalDate.now());
        PrestamoId prestamoId = new PrestamoId("hola");
        RegistroPrestamoId registroId = new RegistroPrestamoId();
        EstadoPrestamo estado = new EstadoPrestamo("registro");
        Prestamo prestamo = new Prestamo(prestamoId,fecha);
        var command = new ActualizarEstadoDelRegistroPrestamoCommand(prestamoId, registroId, estado);
        when(repository.getEventsBy(prestamoId.value())).thenReturn(history());
        useCase.addRepository(repository);
        //act
        var events = UseCaseHandler
                .getInstance().syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event = (CambioDeEstadoEnRegistro)events.get(0);
        Assertions.assertEquals("registro", event.getEstadoPrestamo().value());
    }
    private List<DomainEvent> history(){
        Fecha fecha = new Fecha(LocalDate.now());

        PrestamoId prestamoId = new PrestamoId("hola");
        Prestamo prestamo = new Prestamo(prestamoId, fecha);
        EstadoPrestamo estadoPrestamo = new EstadoPrestamo("reserva");
        RegistroPrestamoId id = new RegistroPrestamoId();
        RegistroPrestamo registroPrestamo = new RegistroPrestamo(id, estadoPrestamo);
        return List.of(
                new NuevoPrestamoCreado(fecha),
                new RegistroAsociadoAprestamo(prestamoId, registroPrestamo)
        );

    }




}