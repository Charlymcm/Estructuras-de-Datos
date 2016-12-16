package prueba1Nuevo;

public class Profesor {
		
		private Persona IdProfesor;
		private Materia materia1;
		private Materia materia2;
	
		public Profesor(Persona profesor_1, Materia materia_1, Materia materia_2) {

			IdProfesor = new Persona(null, null, null);
			materia1 = new Materia(null);
			materia2 = new Materia(null);
			
			this.IdProfesor = profesor_1;
			this.materia1 = materia_1;
			this.materia2 = materia_2;
			
		}

		public Persona getIdProfesor() {
			return IdProfesor;
		}

		public Materia getMateria1() {
			return materia1;
		}

		public Materia getMateria2() {
			return materia2;
		}

		public void setIdProfesor(Persona idProfesor) {
			IdProfesor = idProfesor;
		}

		public void setMateria1(Materia materia1) {
			this.materia1 = materia1;
		}

		public void setMateria2(Materia materia2) {
			this.materia2 = materia2;
		}

		@Override
		public String toString() {
			return "Profesor [IdProfesor=" + IdProfesor + ", materia1=" + materia1 + ", materia2=" + materia2 + "]";
		}
			
}
