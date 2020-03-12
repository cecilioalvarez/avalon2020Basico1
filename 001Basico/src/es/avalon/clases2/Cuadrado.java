package es.avalon.clases2;

public class Cuadrado {
	
	private int lado;
	
	
	//funciones
	public int getLado() {
		return lado;
	}
	public void setLado(int lado) {
		this.lado = lado;
	}
	
	
	
	public double perimetro() {
		return lado*4;
	}
	public double area() {
		return lado*lado;
	}
}

