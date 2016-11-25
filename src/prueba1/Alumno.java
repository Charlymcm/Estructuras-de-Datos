package prueba1;

public class Alumno extends Materia{

private Persona datos;
	
	public Alumno(int id, String n, String materias){				//constructor por defecto
		datos = new Persona();	
	}
	
	public void recibeClases() {
	      System.out.println("Recibe Clases");
	   }

	
}
