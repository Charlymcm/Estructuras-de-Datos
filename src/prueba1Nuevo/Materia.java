package prueba1Nuevo;

public class Materia {

	String NombreMateria;
	
	public Materia(String nombre) {
		super();
		NombreMateria = nombre;
	}

	public String getNombre() {
		return NombreMateria;
	}

	public void setNombre(String nombre) {
		NombreMateria = nombre;
	}

	@Override
	public String toString() {
		return "Materia [Nombre=" + NombreMateria + "]";
	}
	
}
