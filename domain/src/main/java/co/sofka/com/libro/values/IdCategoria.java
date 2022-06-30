package co.sofka.com.libro.values;

import co.com.sofka.domain.generic.Identity;

/**
 * Objeto de valor tipo Identity para categoria
 *
 * @author Diego Felipe Muñoz <diegofelipem99@gmail.com>
 * @version 1.0.0 2022-06-29
 * @since 1.0.0
 */
public class IdCategoria extends Identity {

    public IdCategoria() {
    }

    public IdCategoria(String uuid) {
        super(uuid);
    }

    public static IdCategoria of(String uuid) {
        return new IdCategoria(uuid);
    }
}
