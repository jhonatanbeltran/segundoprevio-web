package entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the asesor database table.
 * 
 */
@Entity
@NamedQuery(name="Servicio.findAll", query="SELECT a FROM Servicio a")
public class Servicio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String nombre;
	
	private String email;
	
	private String clave;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
	
	
	

	