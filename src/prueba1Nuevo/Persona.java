package prueba1Nuevo;

public class Persona {
	
	private String nombre;
	private String apellido;
	private String id;
	
	//constructor
	public Persona (String nombre, String apellido, String id){
		 this.nombre = nombre;
		 this.apellido = apellido;
		 this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getId() {
		return id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", id=" + id + "]";
	}
	
}
