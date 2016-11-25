package prueba1;

import java.util.ArrayList;

public class Aplicacion {

	public static ArrayList<Persona> personas = new ArrayList<Persona>();
	public static ArrayList<Materia> materias = new ArrayList<Materia>();
	
	public static void main(String[] args) {
		
		Persona carlos = new Profesor(1,"Carlos","Calculo,Programacion");
		Persona andrea = new Profesor(2,"Andrea","Algebra,Calculo");
		Persona david = new Profesor(3,"David","Programacion");
		
		Alumno juan = new Alumno(4,"Juan","Programacion,Calculo");
		Alumno kevin = new Alumno(5,"Kevin","Calculo");
		Alumno mishell = new Alumno(6,"Mishell","Algebra");
		Alumno pedro = new Alumno(7,"Pedro","Calculo");
		Alumno maria = new Alumno(8,"Maria","Algebra,Calculo");
		Alumno angel = new Alumno(9,"Angel","Programacion");
		Alumno luis = new Alumno(10,"Luis","Programacion,Calculo");
		
		System.out.println("Reporte de Profesor con sus Alumnos");
		
		
		
		
		
		System.out.println("Reporte de Materias con un Profesor");
		
		
		
		
		
		System.out.println("Reporte de Materias con un Alumno");
		
		
		
		
	}
}
