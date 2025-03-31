package principal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import principal.entidades.Empresa;
import principal.repository.EmpresaRepository;

public class EmpresaServiceImpl implements EmpresaService {

	@Autowired 
	private EmpresaRepository emprepo;
	
	@Override
	public Empresa alta(Empresa empresa) {
		try {
			if (emprepo.existsById(empresa.getId_empresa()))
				return null;
			else  
				return emprepo.save(empresa);
			 
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Empresa modificar(Empresa empresa) {
		try {
			if (emprepo.existsById(empresa.getId_empresa()))
				return emprepo.save(empresa);
			else  
				return null;
			 
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public int eliminar(int id_empresa) {
		try {
			if (emprepo.existsById(id_empresa)) {
				emprepo.deleteById(id_empresa);
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
	public Empresa buscarUna(int id_empresa) {
		// TODO Auto-generated method stub
		return emprepo.findById(id_empresa).orElse(null);
	}

	@Override
	public List<Empresa> buscarTodos() {
		// TODO Auto-generated method stub
		return emprepo.findAll();
	}

}
