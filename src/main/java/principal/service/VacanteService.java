package principal.service;

import java.util.List;

import principal.entidades.Vacante;

public interface VacanteService {
	Vacante alta(Vacante vacante);
	Vacante modificar(Vacante vacante);
	int eliminar(int idVacante);
	Vacante buscarUna(int idVacante);
	List <Vacante> buscarTodos();

}
