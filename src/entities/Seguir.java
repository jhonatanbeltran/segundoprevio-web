package entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the carrera database table.
 * 
 */
@Entity
@NamedQuery(name="Seguir.findAll", query="SELECT c FROM Seguir c")
public class Seguir implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int cliente;
	
	@Id
	private int tienda;

	public int getCliente() {
		return cliente;
	}

	public void setCliente(int cliente) {
		this.cliente = cliente;
	}

	public int getTienda() {
		return tienda;
	}

	public void setTienda(int tienda) {
		this.tienda = tienda;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
	
	

	