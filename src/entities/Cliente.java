package entities;
import javax.persistence.*;
import java.util.List;
import java.io.Serializable;

/**
 * 
 * 
 */
@Entity
@NamedQuery(name="Cliente.findAll", query="SELECT c FROM Cliente c")
public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String clave;

	private String email;

	private String nombre;

	//bi-directional many-to-many association to Tienda
	@ManyToMany(mappedBy="clientes")
	private List<Tienda> tiendas;

	public Cliente() {
	}
	
	public Cliente(int id, String clave, String email, String nombre) {
		super();
		this.id = id;
		this.clave = clave;
		this.email = email;
		this.nombre = nombre;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getClave() {
		return this.clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Tienda> getTiendas() {
		return this.tiendas;
	}

	public void setTiendas(List<Tienda> tiendas) {
		this.tiendas = tiendas;
	}

}
	

