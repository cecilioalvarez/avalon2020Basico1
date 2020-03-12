package es.avalon.clases2;

public class Cuadrado {

	private int lado;

		
	public int getLado() {
		return lado;
	}
	public void setLado(int lado) {
		this.lado = lado;
	}
	public int area() {
		
		return lado*lado;
	}
	public int perimetro() {
		
		return getLado()*4;
	}
}
