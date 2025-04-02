package principal.service;

import java.util.List;

import principal.entidades.Empresa;



public interface EmpresaService {
	Empresa alta(Empresa empresa);
	Empresa modificar(Empresa empresa);
	int eliminar(int idEmpresa);
	Empresa buscarUna(int idEmpresa);
	List <Empresa> buscarTodos();
}
