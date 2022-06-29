package co.sofka.com.libro.commands;

import co.com.sofka.domain.generic.Command;
import co.sofka.com.libro.values.CategoriaLibro;
import co.sofka.com.libro.values.IdCategoria;
/**
 * Comando  AgregarCategoria
 *
 * @Author Diego Felipe Muñoz Mosquera
 * @version 1.0.0 2022-06-29
 * @since 1.0.0
 * *
 */
public class AgregarCategoria extends Command {
    private  final IdCategoria idCategoria;
    private  final CategoriaLibro categoriaLibro;

    public AgregarCategoria(IdCategoria idCategoria, CategoriaLibro categoriaLibro) {
        this.idCategoria = idCategoria;
        this.categoriaLibro = categoriaLibro;
    }

    private IdCategoria idCategoria(){
        return idCategoria;
    }

    private CategoriaLibro categoriaLibro(){
        return categoriaLibro;
    }
}
