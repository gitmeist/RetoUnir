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
import principal.service.CategoriaService;

@RestController
@RequestMapping("/categorias")

public class CategoriaController {
	
	@Autowired
	private CategoriaService catser;
	
	@GetMapping("/")
	public List<Categoria> todas(){
		return catser.buscarTodos();
	}
	
	@GetMapping("/{id_categoria}")
	public Categoria una(@PathVariable int id_categoria ) {
		return catser.buscarUna(id_categoria);
	}
	
	@PostMapping("/")
	public Categoria alta(@RequestBody Categoria categoria) {
		return catser.alta(categoria);
	}
	
	@PutMapping("/modificar") // Hay que anadir un id_categoria?
	public Categoria modificar (@RequestBody Categoria categoria) {
		return catser.modificar(categoria);
	}
	
	@DeleteMapping("/eliminar/{id_categoria}")
	public String eliminar(@PathVariable int id_categoria) {
		switch (catser.elminar(id_categoria)) {
			case 1:  return "Categoria eliminada correctamente";
			case 0:  return "Categoria no existe";
			case -1: return "Esta Categoria no se puede borrar porque tiene asociada otras entidades";
			default:  return null;
		}
	}

}
