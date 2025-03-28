package principal.service;

import java.util.List;

import principal.entidades.Empresa;



public interface EmpresaService {
	Empresa alta(Empresa empresa);
	Empresa modificar(Empresa empresa);
	int eliminar(int id_empresa);
	Empresa buscarUna(int id_empresa);
	List <Empresa> buscarTodos();
}
