package principal.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Empresas")
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Empresa {

	private int id_empresa;
	private String cif;
	private String nombre_empresa;
	private String direccion_fiscal;
	private String pais;
	private String email;
	
	
}
