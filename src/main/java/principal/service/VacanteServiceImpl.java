package principal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import principal.entidades.Vacante;
import principal.repository.VacanteRepository;
@Service
public class VacanteServiceImpl implements VacanteService {

	@Autowired
	private VacanteRepository vacrepo;
	
	@Override
	public Vacante alta(Vacante vacante) {
		try {
			if (vacrepo.existsById(vacante.getIdVacante()))
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
			if (vacrepo.existsById(vacante.getIdVacante()))
				return vacrepo.save(vacante);
			else  
				return null;
			 
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public int eliminar(int idVacante) {
		try {
			if (vacrepo.existsById(idVacante)) {
				vacrepo.deleteById(idVacante);
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
	public Vacante buscarUna(int idVacante) {
		
		return vacrepo.findById(idVacante).orElse(null);
	}

	@Override
	public List<Vacante> buscarTodos() {
		
		return vacrepo.findAll();
	}

}
