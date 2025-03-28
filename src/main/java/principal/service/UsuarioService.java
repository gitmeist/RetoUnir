package principal.service;

import java.util.List;

import principal.entidades.Usuario;

public interface UsuarioService {
	Usuario alta(Usuario usuario);
	Usuario modificar(Usuario usuario);
	int eliminar(String email);
	Usuario buscarUna(String email);
	List <Usuario> buscarTodos();
}
