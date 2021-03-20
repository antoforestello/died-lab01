package ar.edu.utn.frsf.died.prueba;


public class Main {
	public static void main(String[] args) {
		System.out.println("Hola!");
		
		Persona uno = new Persona((short)18,"Carlos", 1.70);
		System.out.println(uno.getNombre());
		
		Alumno juan = new Alumno((short)18, "Juan", 1.80);
		System.out.println(juan.getNombre());
		
	}
}
