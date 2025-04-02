package principal.service;

import java.util.List;

import principal.entidades.Categoria;

public interface CategoriaService {
	Categoria alta(Categoria categoria);
	Categoria modificar(Categoria categoria);
	int eliminar (int idCategoria);
	Categoria buscarUna(int idCategoria);
	List<Categoria> buscarTodos();
	

}
