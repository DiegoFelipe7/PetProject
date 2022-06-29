package co.sofka.com.biblioteca.values;

import co.com.sofka.domain.generic.Identity;

/**
 * Objeto de valor tipo Identity para Biblioteca
 *
 * @author Ricardo Ortega <tattortega.28@gmail.com>
 * @version 1.0.0 2022-06-29
 * @since 1.0.0
 */
public class BibliotecaId extends Identity {

    public BibliotecaId() {

    }

    public BibliotecaId(String uuid) {
        super(uuid);
    }

    public static BibliotecaId of(String uuid) {
        return new BibliotecaId(uuid);
    }
}
