package principal.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Categorias")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Categoria {
	 	@Id
	 	@GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id_categoria;
	    
	    private String nombre;
	    private String descripcion;
	    
	    

}
