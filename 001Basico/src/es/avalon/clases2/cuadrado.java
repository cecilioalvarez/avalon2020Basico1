package es.avalon.clases2;

public class cuadrado {

	private double lado;
	
	public double getlado() {
		return lado;
	}
	
	public void setlado(double lado) {
		this.lado=lado;
	}
	
	public double area() {
		return lado*lado;
	}
	
	public double perimetro() {
		return 4*lado;
	}
}
