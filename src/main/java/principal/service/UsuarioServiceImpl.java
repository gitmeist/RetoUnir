package principal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import principal.entidades.Usuario;
import principal.repository.UsuarioRepository;
@Service
public class UsuarioServiceImpl implements UsuarioService{

	@Autowired
	private UsuarioRepository usurepo;
	
	@Override
	public Usuario alta(Usuario usuario) {
		try {
			if (usurepo.existsById(usuario.getEmail()))
				return null;
			else  
				return usurepo.save(usuario);
			 
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Usuario modificar(Usuario usuario) {
		try {
			if (usurepo.existsById(usuario.getEmail()))
				return usurepo.save(usuario);
			else  
				return null;
			 
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public int eliminar(String email) {
		try {
			if (usurepo.existsById(email)) {
				usurepo.deleteById(email);
				return 1;
			}
			else  
				return 0;
			 
			
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}

	@Override
	public Usuario buscarUna(String email) {
		
		return usurepo.findById(email).orElse(null);
	}

	@Override
	public List<Usuario> buscarTodos() {
		
		return usurepo.findAll();
	}

}
