package prueba1Nuevo;

public class Alumno {

	private Persona alumno1;
	private Materia materia1;
	private Materia materia2;

	public Alumno() {
		alumno1 = new Persona(null, null, null);
		materia1 = new Materia(null);
		materia2 = new Materia(null);
		
	}

	public Alumno(Persona persona4, Materia materia_1, Materia materia_2){

		alumno1 = new Persona(null, null, null);
		materia1 = new Materia(null);
		materia2 = new Materia(null);

		this.alumno1 = alumno1;
		this.materia1 = materia_1;
		this.materia2 = materia_2;
	}


	public Persona getAlumno1() {
		return alumno1;
	}


	public Materia getMateria1() {
		return materia1;
	}


	public Materia getMateria2() {
		return materia2;
	}


	public void setAlumno1(Persona alumno1) {
		this.alumno1 = alumno1;
	}


	public void setMateria1(Materia materia1) {
		this.materia1 = materia1;
	}


	public void setMateria2(Materia materia2) {
		this.materia2 = materia2;
	}


	@Override
	public String toString() {
		return "Alumno [alumno1=" + alumno1 + ", materia1=" + materia1 + ", materia2=" + materia2 + "]";
	}



}
