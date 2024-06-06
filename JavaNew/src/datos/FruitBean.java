package datos;

public class FruitBean {
	
	private int id;
	private String nombre;
	
	// CONSTRUCTOR VACIO
		public FruitBean() {
			// TODO Auto-generated constructor stub
		}
		
		
		// CONSTRUCTOR CON PARAMETROS
		public FruitBean(int id, String nombre) {
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
			return "FruitBean [id=" + id + ", nombre=" + nombre + "]";
		}
		
}
