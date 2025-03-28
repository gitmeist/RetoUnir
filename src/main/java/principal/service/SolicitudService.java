package principal.service;

import java.util.List;

import principal.entidades.Solicitud;


public interface SolicitudService {
	Solicitud alta(Solicitud solicitud);
	Solicitud modificar(Solicitud solicitud);
	int eliminar(int id_solicitud);
	Solicitud buscarUna(int id_solicitud);
	List <Solicitud> buscarTodos();
}
