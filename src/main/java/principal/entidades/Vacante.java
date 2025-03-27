package principal.entidades;

import java.time.LocalDate;
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

// Paso 1: Verificar variables entre bbdd y springboot
// Paso 2: Verificar relaciones 1:N entre entidades
// Paso 3: Establecer condiconales de longitud para los campos conforme a la bbdd
// Paso 4: Verificar los JoinColumns en caso de aplicar un camelCase
@Entity
@Table(name="Vacantes")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vacante {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_vacante;	
	private String nombre;
	private String descripcion;
	private Date fecha;
	private Double salario;
	private String estatus; // Usaremos un enum en Java para CREADA, CUBIERTA, CANCELADA
	private int destacado;
	private String imagen;
	private String detalles;
	
	@ManyToOne
	@JoinColumn(name="id_categoria")
	private Categoria categoria; // Relación ManyToOne con Categoria
	
	@ManyToOne
	@JoinColumn(name="id_empresa")
	private Empresa empresa; // Relación ManyToOne con Empresa
}
