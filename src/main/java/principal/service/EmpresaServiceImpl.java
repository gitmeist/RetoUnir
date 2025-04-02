package principal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import principal.entidades.Empresa;
import principal.repository.EmpresaRepository;
@Service
public class EmpresaServiceImpl implements EmpresaService {

	@Autowired 
	private EmpresaRepository emprepo;
	
	@Override
	public Empresa alta(Empresa empresa) {
		try {
			if (emprepo.existsById(empresa.getIdEmpresa()))
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
			if (emprepo.existsById(empresa.getIdEmpresa()))
				return emprepo.save(empresa);
			else  
				return null;
			 
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public int eliminar(int idEmpresa) {
		try {
			if (emprepo.existsById(idEmpresa)) {
				emprepo.deleteById(idEmpresa);
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
	public Empresa buscarUna(int idEmpresa) {
		// TODO Auto-generated method stub
		return emprepo.findById(idEmpresa).orElse(null);
	}

	@Override
	public List<Empresa> buscarTodos() {
		// TODO Auto-generated method stub
		return emprepo.findAll();
	}

}
