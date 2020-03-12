package es.avalon.clases2;

public class Cuadrado {
	private int lado;
	
	public int getLado() {
		return lado;
	}
	
	public void setLado(int lado) {
		this.lado=lado;
		
	}
	public double area() {
		return lado*lado;
	}

	public double perimetro() {
		return 4 * lado;
	}
}
