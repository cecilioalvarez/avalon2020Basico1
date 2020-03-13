package es.avalon.clases4;

public class Ejemplar {

	private int numero;
	private double peso;
	private static double pesototal=0;
	//Genero get y set para numero
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	//Genero get y set para peso
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	//genero get y set como estatico para peso total
	public static double getPesototal() {
		return pesototal;
	}
	public static void setPesototal(double pesototal) {
		Ejemplar.pesototal = pesototal;
	}
	//Genero el constructor
	public Ejemplar(int numero, double peso) {
		super();
		this.numero = numero;
		this.peso = peso;
		//operacion estatica
		Ejemplar.pesototal=pesototal+peso;
	}
	
	
	
}
