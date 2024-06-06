package datos;

public class AnimalBean {

	private int id;
	private String nombre;
	
	// CONSTRUCTOR VACIO
	public AnimalBean() {
		// TODO Auto-generated constructor stub
	}
	
	
	// CONSTRUCTOR CON PARAMETROS
	public AnimalBean(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}



	// SETTER & GETTER
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


	@Override
	public String toString() {
		return "AnimalBean [id=" + id + ", nombre=" + nombre + "]";
	}
	
	
}
