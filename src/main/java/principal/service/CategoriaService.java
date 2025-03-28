package principal.service;

import java.util.List;

import principal.entidades.Categoria;

public interface CategoriaService {
	Categoria alta(Categoria categoria);
	Categoria modificar(Categoria categoria);
	int elminar (int id_categoria);
	Categoria buscarUna(int id_categoria);
	List<Categoria> buscarTodos();
	

}
