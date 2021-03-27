package died.lab01.problema03;

import died.lab01.problema02.Escala;
import died.lab01.problema02.Temperatura;

public class Registro {
	
	private String ciudad;
	private Temperatura temperatura[]; 
	private int ultTemp =0;
	static private int capMax = 30;
	
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	public Registro() {
		this.ciudad= "-";
		this.temperatura = new Temperatura[this.capMax]; 
	}
	public Registro(String ciudad) {
		this.ciudad= ciudad;
		this.temperatura = new Temperatura[this.capMax]; 
	}
	
	public String getCiudad() {
		return this.ciudad;
	}
	
	public void imprimir() {
		System.out.println("TEMPERATURAS REGISTRADAS EN: "+ this.ciudad);
		for(int i =1; i<= ultTemp; i++) { 
			if(temperatura[i-1].getEscala() == Escala.CELCIUS) {
			System.out.println(i+ " " + temperatura[i-1].asCelcius() + " C°");
			} else {
				System.out.println(i+ " " + temperatura[i-1].asFahrenheit() + " F°");
			}
		}
	}
	public void agregar(Temperatura t) {
		if(ultTemp<capMax) {
			this.temperatura[ultTemp]=t;
			this.ultTemp++;
		}
	}
	public double mediaAsCelcius() {
		double promedio=0;
		for(int i =0; i<ultTemp;i++) {
			promedio = promedio + this.temperatura[i].asCelcius();
		}
		promedio = promedio/ultTemp;
		return promedio;
	}
	
	public double mediaAsFahrenheit() {
		double promedio=0;
		for(int i =0; i<ultTemp;i++) {
			promedio = promedio + this.temperatura[i].asFahrenheit();
		}
		return promedio/(ultTemp+1);	
	}
	
	/*public Temperatura maximo() {
		Temperatura rdo= this.temperatura[0];
		for(int i=0; i< ultTemp; i++) {
			if(temperatura[i].asCelcius() > rdo.asCelcius()) {
				rdo = temperatura[i];
			}
		}
		return rdo;
	}*/
	
	public Temperatura maximo() {
		Temperatura retorno=  recursivo(this.temperatura[0],1); // lo llamo con la primer temperatura y el segundo indice
		return retorno;
	}
	
	private Temperatura recursivo(Temperatura t, int indice ) {
	
		if(indice<this.getUltTemp()){ //ultTemp = 3
			if(this.temperatura[indice].asCelcius() > t.asCelcius()) {
				t= recursivo(temperatura[indice], indice+1);
			}
			else {
				t= recursivo(t, indice+1);
			}
		}
 		return t;
	}
	public int getUltTemp() {
		return ultTemp;
	}
	public void setUltTemp(int ultTemp) {
		this.ultTemp = ultTemp;
	}

}
