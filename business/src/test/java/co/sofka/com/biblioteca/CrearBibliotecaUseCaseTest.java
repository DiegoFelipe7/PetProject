package co.sofka.com.biblioteca;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.sofka.com.biblioteca.commands.CrearBiblioteca;
import co.sofka.com.biblioteca.events.BibliotecaCreada;
import co.sofka.com.biblioteca.usecases.CrearBibliotecaUseCase;
import co.sofka.com.biblioteca.values.BibliotecaId;
import co.sofka.com.biblioteca.values.BibliotecarioId;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


/**
 * Test para el caso de uso crear Biblioteca
 *
 * @author Ricardo Ortega <tattortega.28@gmail.com>
 * @version 1.0.0 2022-06-29
 * @since 1.0.0
 */
@ExtendWith(MockitoExtension.class)
public class CrearBibliotecaUseCaseTest {

    @Mock
    DomainEventRepository repository;

    @InjectMocks
    private CrearBibliotecaUseCase crearBibliotecaUseCase;

    @Test
    void crearBibliotecaTest() {
        //arrange
        BibliotecaId bibliotecaId = new BibliotecaId("hola");
        BibliotecarioId bibliotecarioId = new BibliotecarioId("hol");
        var command = new CrearBiblioteca(bibliotecaId, bibliotecarioId);


        //act
        var events = UseCaseHandler
                .getInstance().syncExecutor(crearBibliotecaUseCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event = (BibliotecaCreada) events.get(0);
        Assertions.assertEquals("hol", event.bibliotecarioId().value());
    }


}
