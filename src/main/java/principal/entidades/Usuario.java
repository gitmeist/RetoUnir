package principal.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name = "Usuarios")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Usuario {
	@Id	
	private String email;
	private String nombre;
	private String apellidos;
	private String password;
	private int enabled;
	private String rol;
	

}
