package ar.edu.utn.frsf.died.prueba;

public class Alumno extends Persona{
	int materiasAprobadas;
	Persona conocido; 
	public Alumno(short edad,String nombre, double altura) {
		super(edad, nombre, altura);
	}
	
	public String getNombreAlumno() {
		return this.getNombre();
	}
}
