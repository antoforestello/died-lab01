package died.lab01.problema04;

import java.util.Random;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		 byte apuestas[]= new byte[3]; 
		 float monto[]= new float[3];
		 byte resultado;
		 Random r = new Random();
		Scanner entrada = new Scanner(System.in);
		 for(int i=0; i<3; i++) {
			 System.out.print("Ingrese el numero "+ (i+1) + " a apostar");
			 apuestas[i]= entrada.nextByte();
			 System.out.println("Ingrese el monto a apostar: ");
			 monto[i]= entrada.nextFloat();
		 }
		
	}
}