package prueba1;

public class Profesor extends Persona{

	private Persona datos;
	
	public Profesor(int id, String n, String materias){				//constructor por defecto
		datos = new Persona();	
	}
	
	public void darClases() {
	      System.out.println("Da Clases");
	   }
	

}

	