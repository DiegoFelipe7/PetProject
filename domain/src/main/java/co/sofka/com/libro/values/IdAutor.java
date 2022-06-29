package co.sofka.com.libro.values;

import co.com.sofka.domain.generic.Identity;
/**
 * Objeto de valor tipo Identity para Autor
 *
 * @author Diego Felipe Muñoz <diegofelipem99@gmail.com>
 * @version 1.0.0 2022-06-29
 * @since 1.0.0
 */
public class IdAutor extends Identity {
    public IdAutor(String uuid) {
        super(uuid);
    }
    public static IdAutor of(String uuid) {
        return new IdAutor(uuid);
    }
}
