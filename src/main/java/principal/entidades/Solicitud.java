package principal.entidades;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Solicitudes")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Solicitud {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_solicitud;
	private Date fecha;
	private String archivo;
	private String comentarios;
	private String curriculum;	
	private int estado;
	
	@ManyToOne
	@JoinColumn(name="id_vacante")
	private int id_vacante;
	
	@ManyToOne
	@JoinColumn(name="email")
	private String email;
	
	
	
}
