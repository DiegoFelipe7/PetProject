package co.sofka.com.biblioteca.values;

import co.com.sofka.domain.generic.Identity;

/**
 * Objeto de valor tipo Identity para Bibliotecario
 *
 * @author Ricardo Ortega <tattortega.28@gmail.com>
 * @version 1.0.0 2022-06-29
 * @since 1.0.0
 */
public class BibliotecarioId extends Identity {

    public BibliotecarioId() {

    }

    public BibliotecarioId(String uuid) {
        super(uuid);
    }

    public BibliotecarioId of(String uuid) {
        return new BibliotecarioId(uuid);
    }
}
