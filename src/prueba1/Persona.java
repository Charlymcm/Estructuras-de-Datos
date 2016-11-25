package prueba1;

public class Persona {
	
	private int id;
	private String nombres;
		
	public Persona() {
	}

	
	public int getId() {
		return id;
	}


	public String getNombres() {
		return nombres;
	}


	public void setId(int id) {
		this.id = id;
	}


	public void setNombres(String nombres) {
		this.nombres = nombres;
	}


	public String toString() {
		return "nombres: "+this.nombres +"id: "+this.id ;
	}

}
