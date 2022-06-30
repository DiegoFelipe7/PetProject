package co.sofka.com.libro.entities;

import co.com.sofka.domain.generic.Entity;
import co.sofka.com.libro.values.CategoriaLibro;
import co.sofka.com.libro.values.IdCategoria;

/**
 * Entidad  Categoria
 *
 * @author Diego Felipe Muñoz <diegofelipem99@gmail.com>
 * @version 1.0.0 2022-06-29
 * @since 1.0.0
 * *
 */
public class Categoria extends Entity<IdCategoria> {
    protected CategoriaLibro categoria;

    public Categoria(IdCategoria entityId, CategoriaLibro categoria) {
        super(entityId);
        this.categoria = categoria;
    }

    public void agregarCategoriaCliente(CategoriaLibro categoria) {
        this.categoria = categoria;
    }
}
