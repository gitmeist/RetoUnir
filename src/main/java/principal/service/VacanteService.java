package principal.service;

import java.util.List;

import principal.entidades.Vacante;

public interface VacanteService {
	Vacante alta(Vacante vacante);
	Vacante modificar(Vacante vacante);
	int eliminar(int id_vacante);
	Vacante buscarUna(int id_vacante);
	List <Vacante> buscarTodos();

}
