package principal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import principal.entidades.Categoria;
import principal.repository.CategoriaRepository;
@Service
public class CategoriaServiceImpl implements CategoriaService{

	@Autowired CategoriaRepository catrepo;
	
	@Override
	public Categoria alta(Categoria categoria) {
		try {
			if (catrepo.existsById(categoria.getIdCategoria()))
				return null;
			else
				return catrepo.save(categoria);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public Categoria modificar(Categoria categoria) {
		try {
			if(catrepo.existsById(categoria.getIdCategoria()))
				return catrepo.save(categoria);
			else
				return null;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int eliminar(int idCategoria) {
		try {
			if(catrepo.existsById(idCategoria)) {
				catrepo.deleteById(idCategoria);
				return 1;
			}
			else
				return 0;
		}
		catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
		
	}

	@Override
	public Categoria buscarUna(int idCategoria) {
		
		return catrepo.findById(idCategoria).orElse(null);
	}

	@Override
	public List<Categoria> buscarTodos() {
		// TODO Auto-generated method stub
		return catrepo.findAll();
	}

	

}
