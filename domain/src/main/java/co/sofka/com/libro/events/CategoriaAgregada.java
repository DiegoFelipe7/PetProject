package co.sofka.com.libro.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.sofka.com.libro.values.CategoriaLibro;
import co.sofka.com.libro.values.IdCategoria;

/**
 * DomainEvent  CategoriaAgregada
 *
 * @author Diego Felipe Muñoz <diegofelipem99@gmail.com>
 * @version 1.0.0 2022-06-29
 * @since 1.0.0
 * *
 */
public class CategoriaAgregada extends DomainEvent {
    private final IdCategoria idCategoria;
    private final CategoriaLibro categoria;

    public CategoriaAgregada(IdCategoria idCategoria, CategoriaLibro categoria) {
        super("co.sofka.com.libro.CategoriaAgregada");
        this.idCategoria = idCategoria;
        this.categoria = categoria;
    }

    public IdCategoria getIdCategoria() {
        return idCategoria;
    }

    public CategoriaLibro getCategoria() {
        return categoria;
    }
}
