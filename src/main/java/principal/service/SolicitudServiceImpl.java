package principal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import principal.entidades.Solicitud;
import principal.repository.SolicitudRepository;

public class SolicitudServiceImpl implements SolicitudService {

	@Autowired SolicitudRepository solrepo;
	
	@Override
	public Solicitud alta(Solicitud solicitud) {
		try {
			if (solrepo.existsById(solicitud.getId_solicitud()))
				return null;
			else  
				return solrepo.save(solicitud);
			 
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Solicitud modificar(Solicitud solicitud) {
		try {
			if (solrepo.existsById(solicitud.getId_solicitud()))
				return solrepo.save(solicitud);
			else  
				return null;
			 
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public int eliminar(int id_solicitud) {
		try {
			if (solrepo.existsById(id_solicitud)) {
				solrepo.deleteById(id_solicitud);
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
	public Solicitud buscarUna(int id_solicitud) {
		// TODO Auto-generated method stub
		return solrepo.findById(id_solicitud).orElse(null);
	}

	@Override
	public List<Solicitud> buscarTodos() {
		// TODO Auto-generated method stub
		return solrepo.findAll();
	}

}
