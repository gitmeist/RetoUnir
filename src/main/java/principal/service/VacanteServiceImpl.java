package principal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import principal.entidades.Vacante;
import principal.repository.VacanteRepository;

public class VacanteServiceImpl implements VacanteService {

	@Autowired
	private VacanteRepository vacrepo;
	
	@Override
	public Vacante alta(Vacante vacante) {
		try {
			if (vacrepo.existsById(vacante.getId_vacante()))
				return null;
			else  
				return vacrepo.save(vacante);
			 
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}

	@Override
	public Vacante modificar(Vacante vacante) {
		try {
			if (vacrepo.existsById(vacante.getId_vacante()))
				return vacrepo.save(vacante);
			else  
				return null;
			 
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public int eliminar(int id_vacante) {
		try {
			if (vacrepo.existsById(id_vacante)) {
				vacrepo.deleteById(id_vacante);
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
	public Vacante buscarUna(int id_vacante) {
		
		return vacrepo.findById(id_vacante).orElse(null);
	}

	@Override
	public List<Vacante> buscarTodos() {
		
		return vacrepo.findAll();
	}

}
