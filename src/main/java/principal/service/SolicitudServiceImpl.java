package principal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import principal.entidades.Solicitud;
import principal.repository.SolicitudRepository;
@Service
public class SolicitudServiceImpl implements SolicitudService {

	@Autowired SolicitudRepository solrepo;
	
	@Override
	public Solicitud alta(Solicitud solicitud) {
		try {
			if (solrepo.existsById(solicitud.getIdSolicitud()))
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
			if (solrepo.existsById(solicitud.getIdSolicitud()))
				return solrepo.save(solicitud);
			else  
				return null;
			 
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public int eliminar(int idSolicitud) {
		try {
			if (solrepo.existsById(idSolicitud)) {
				solrepo.deleteById(idSolicitud);
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
	public Solicitud buscarUna(int idSolicitud) {
		// TODO Auto-generated method stub
		return solrepo.findById(idSolicitud).orElse(null);
	}

	@Override
	public List<Solicitud> buscarTodos() {
		// TODO Auto-generated method stub
		return solrepo.findAll();
	}

}
