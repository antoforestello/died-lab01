package ar.edu.utn.frsf.died.prueba;

public class Persona {
	private short edad;
	private String nombre;
	private double altura;
	
	public Persona(short edad, String nombre, double altura) {
		this.edad = edad;
		this.nombre = nombre;
		this.altura = altura; 
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
}
