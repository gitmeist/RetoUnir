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

	@GetMapping("/{id_empresa}")
	public Empresa una(@PathVariable int id_empresa ) {
		return empser.buscarUna(id_empresa);
	}
	
	@PostMapping("/")
	public Empresa alta(@RequestBody Empresa empresa) {
		return empser.alta(empresa);
	}
	
	@PutMapping("/modificar") // Hay que anadir un id_categoria?
	public Empresa modificar (@RequestBody Empresa empresa) {
		return empser.modificar(empresa);
	}
	
	@DeleteMapping("/eliminar/{id_categoria}")
	public String eliminar(@PathVariable int id_empresa) {
		switch (empser.eliminar(id_empresa)) {
			case 1:  return "Empresa eliminada correctamente";
			case 0:  return "Empresa no existe";
			case -1: return "Esta Empresa no se puede borrar porque tiene asociada otras entidades";
			default:  return null;
		}
	}
}
