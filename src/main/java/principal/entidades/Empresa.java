package principal.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_empresa")
	private int idEmpresa;
	private String cif;
	private String nombreEmpresa;
	private String direccionFiscal;
	private String pais;
	private String email;
	
	
}
