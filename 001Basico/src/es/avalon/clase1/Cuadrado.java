package es.avalon.clase1;

public class Cuadrado {
	private double lado;

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public double Area() {
		 
		 return lado*lado;
		 
	 }

	public double Perimetro() {
		 
		 return 4*getLado();
	 }
}
