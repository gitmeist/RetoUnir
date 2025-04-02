package principal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import principal.entidades.Categoria;
import principal.entidades.Empresa;
import principal.service.EmpresaService;

@RestController
@RequestMapping("/empresas")

public class EmpresaController {
	
	@Autowired
	private EmpresaService empser;
	
	@GetMapping("/")
	public List<Empresa> todas(){
		return empser.buscarTodos();
	}

	@GetMapping("/{idEmpresa}")
	public Empresa una(@PathVariable int idEmpresa ) {
		return empser.buscarUna(idEmpresa);
	}
	
	@PostMapping("/")
	public Empresa alta(@RequestBody Empresa empresa) {
		return empser.alta(empresa);
	}
	
	@PutMapping("/modificar/{idEmpresa}") // Hay que anadir un id_categoria?
	public Empresa modificar (@PathVariable int idEmpresa , @RequestBody Empresa empresa) {
		return empser.modificar(empresa);
	}
	
	@DeleteMapping("/eliminar/{idEmpresa}")
	public String eliminar(@PathVariable int idEmpresa) {
		switch (empser.eliminar(idEmpresa)) {
			case 1:  return "Empresa eliminada correctamente";
			case 0:  return "Empresa no existe";
			case -1: return "Esta Empresa no se puede borrar porque tiene asociada otras entidades";
			default:  return null;
		}
	}
}
