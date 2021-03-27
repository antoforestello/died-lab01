package died.lab01.problema02;

public class Temperatura {
	private double grados;
	private Escala escala;
	
	public Temperatura() {
		grados=0;
		escala= Escala.CELCIUS;
	}
	public Temperatura(double grados, Escala escala) {
		this.grados=grados;
		this.escala=escala; 
	}
	
	public String toString() {
		String stringNumero= String.valueOf(this.grados);
		String stringEscala="";
		switch(this.escala) {
		case CELCIUS: stringEscala = " C°";
					break;
		case FAHRENHEIT: stringEscala = " F°";
					break;
		}
		String salida= stringNumero.concat(stringEscala);
		return salida;
	}
	
	public Escala getEscala() {
		return escala;
	}
	public void setEscala(Escala escala) {
		this.escala = escala;
	}
	public double asCelcius() {
		double resultado; 
		if(this.escala == Escala.CELCIUS) {
			resultado = this.grados;
		}else {
			resultado = (this.grados -32) * 5 / 9;
		}
		return resultado;
	}
	
	public double asFahrenheit() {
		double resultado; 
		if(this.escala == Escala.FAHRENHEIT) {
			resultado = this.grados;
		}else {
			resultado = (this.grados * 9 / 5 )  + 32;
		}
		return resultado;
	}
	
	public void aumentar(Temperatura temperatura) {
		if(temperatura.grados > 0.0) {
			Escala estaEscala = this.escala;
			switch(estaEscala) {
			case CELCIUS:this.grados = this.grados + temperatura.asCelcius();
			break;
			case FAHRENHEIT: this.grados = this.grados + temperatura.asFahrenheit();
			break;
			}	
		}
	}
	
	public void disminuir(Temperatura temperatura) {
		if(temperatura.grados > 0.0) {
			Escala estaEscala = this.escala;
			switch(estaEscala) {
			case CELCIUS:this.grados = this.grados - temperatura.asCelcius();
			break;
			case FAHRENHEIT: this.grados = this.grados - temperatura.asFahrenheit();
			break;
			}	
		}
	}
}
