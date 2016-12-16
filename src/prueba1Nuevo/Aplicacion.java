package prueba1Nuevo;

public class Aplicacion {

	public static void main (String [ ] Args) {

		Profesor[] ListaProfesores= new Profesor[3];		//lista con los profesores
		Alumno[] ListaAlumnos = new Alumno[7];				//lista con los alumnos
		Alumno[] ListaCalculo = new Alumno[5];				//lista de Calculo Vectorial
		Alumno[] ListaAtletismo = new Alumno[5];			//lista de Atletismo
		Alumno[] ListaProgramacion = new Alumno[5];			//lista de Programacion
		Alumno[] ListaCocina = new Alumno[5];				//lista de Cocina
		Alumno[] ListaQuimicaAvanzada = new Alumno[5];		//lista de Quimica Avanzada
		
		Persona persona1 = new Persona ("Mónica","Paillacho","1");
		Persona persona2 = new Persona ("Victoria","Pozo","1");
		Persona persona3 = new Persona ("Manuel","Rojas","1");
		Persona persona4 = new Persona ("Carlos","Morales","2");
		Persona persona5 = new Persona ("Andrea","Viracucha","2");
		Persona persona6 = new Persona ("Gabriela","Ramos","2");
		Persona persona7 = new Persona ("Marcelo","Torres","2");
		Persona persona8 = new Persona ("Pamela","Bohorquez","2");
		Persona persona9 = new Persona ("Marco","Rodriguez","2");
		Persona persona10 = new Persona ("Mayra","Castillo","2");
		
		Materia materia1 = new Materia("Calculo Vectorial");
		Materia materia2 = new Materia("Atletismo");
		Materia materia3 = new Materia("Programación");
		Materia materia4 = new Materia("Cocina");
		Materia materia5 = new Materia("Química Avanzada");
		
		Profesor profesor1 = new Profesor (persona1,materia1,materia5);
		ListaProfesores[0] = profesor1;
		Profesor profesor2 = new Profesor (persona2,materia2,materia4);
		ListaProfesores[1] = profesor2;
		Profesor profesor3 = new Profesor (persona3,materia3,materia1);
		ListaProfesores[2] = profesor3;
		
		Alumno alumno1 = new Alumno (persona4,materia1,materia2);
		ListaAlumnos[0] = alumno1;
		Alumno alumno2 = new Alumno (persona5,materia3,materia4);
		ListaAlumnos[1] = alumno2;
		Alumno alumno3 = new Alumno (persona6,materia1,materia3);
		ListaAlumnos[2] = alumno3;
		Alumno alumno4 = new Alumno (persona7,materia2,materia4);
		ListaAlumnos[3] = alumno4;
		Alumno alumno5 = new Alumno (persona8,materia1,materia5);
		ListaAlumnos[4] = alumno5;
		Alumno alumno6 = new Alumno (persona9,materia2,materia3);
		ListaAlumnos[5] = alumno6;
		Alumno alumno7 = new Alumno (persona10,materia4,materia5);
		ListaAlumnos[6] = alumno7;
	
				
		//Materia 1 - Calculo Vectorial
	
		
		
		
		

	}
}
