package died.lab01.problema01;

public class Recta {
	private Punto p1, p2;
	private float pendiente;
	
	public Recta(Punto p1, Punto p2) {
		this.p1=p1;
		this.p2=p2;
		this.pendiente= this.pendiente();
	}
	public Recta() {
		this.pendiente=1;
		this.p1= new Punto(0,0);
		this.p2= new Punto(1,1);
	}
	
	public float getPendiente() {
		return pendiente;
	}
	public void setPendiente(float pendiente) {
		this.pendiente = pendiente;
	}
	public Punto getP1() {
		return p1;
	}
	public void setP1(Punto p1) {
		this.p1 = p1;
	}
	public Punto getP2() {
		return p2;
	}
	public void setP2(Punto p2) {
		this.p2 = p2;
	}
	public float pendiente() {
		return	this.pendiente= (this.p2.getY()-this.p1.getY())/(this.p2.getX()-this.p1.getX());
	} 
	
	public boolean paralelas(Recta otraRecta) {
		return (this.pendiente() == otraRecta.pendiente());
	}
	
	public boolean equals(Recta otraRecta) {
		Recta tercera = new Recta(this.getP1(), otraRecta.getP1());
		return (this.pendiente() == otraRecta.pendiente() && otraRecta.pendiente() == tercera.pendiente() );
	}
}
