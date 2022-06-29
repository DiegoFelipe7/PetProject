package co.sofka.com.libros;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.sofka.com.libro.commands.CrearLibroCommand;
import co.sofka.com.libro.events.LibroCreado;
import co.sofka.com.libro.usecases.CrearLibroUseCase;
import co.sofka.com.libro.values.Fecha;
import co.sofka.com.libro.values.IdLibro;
import co.sofka.com.libro.values.Titulo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;

import static org.mockito.Mockito.when;
/**
 * Test para el caso de uso crear Libro
 *
 * @author Diego Felipe Muñoz <diegofelipem99@gmail.com>
 * @version 1.0.0 2022-06-29
 * @since 1.0.0
 */
@ExtendWith(MockitoExtension.class)
public class CrearLibroUseCaseTest {
    @Mock
    DomainEventRepository repository;

    @InjectMocks
    CrearLibroUseCase useCase;

    @Test
    public void guardarLibroTest(){
        //arrange
        IdLibro idlibro = new IdLibro("1");
        Titulo titulo = new Titulo("Cronicas de narnia");
        Fecha fecha = new Fecha(LocalDate.now());
        var command = new CrearLibroCommand(idlibro,titulo,fecha);
        //act
        var events = UseCaseHandler
                .getInstance().syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();
        //assertion
        var event =(LibroCreado) events.get(0);
        Assertions.assertEquals("Cronicas de narnia",event.titulo().value());
    }
}
