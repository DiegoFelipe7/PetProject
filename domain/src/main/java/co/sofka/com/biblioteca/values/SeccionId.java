package co.sofka.com.biblioteca.values;

import co.com.sofka.domain.generic.Identity;

/**
 * Objeto de valor tipo Identity para Seccion
 *
 * @author Ricardo Ortega <tattortega.28@gmail.com>
 * @version 1.0.0 2022-06-29
 * @since 1.0.0
 */
public class SeccionId extends Identity {

    public SeccionId() {

    }

    private SeccionId(String uuid) {
        super(uuid);
    }

    public static SeccionId of(String uuid) {
        return new SeccionId(uuid);
    }
}
