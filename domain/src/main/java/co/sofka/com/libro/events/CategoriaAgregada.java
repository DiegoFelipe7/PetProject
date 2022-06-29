package co.sofka.com.libro.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.sofka.com.libro.entities.Categoria;
import co.sofka.com.libro.values.CategoriaLibro;
import co.sofka.com.libro.values.IdCategoria;
import co.sofka.com.libro.values.Titulo;

public class CategoriaAgregada extends DomainEvent {
    private final IdCategoria idCategoria;
    private final CategoriaLibro categoria;

    public CategoriaAgregada(IdCategoria idCategoria, CategoriaLibro categoria){
        super("sofka.categoria.CategoriaAgregada");
        this.idCategoria = idCategoria;
        this.categoria = categoria;
    }

    public IdCategoria getIdCategoria(){
        return idCategoria;
    }

    public CategoriaLibro getCategoria(){
        return categoria;
    }
}
