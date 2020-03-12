package es.avalon.clases4;

public class CUadrado {
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
	return 4*lado;
	
}
}
