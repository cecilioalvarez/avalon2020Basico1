package es.avalon.clases4;

public class Bolsa {

	private int numero;
	private int peso;
//	private static double pesototal;
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
//	public static double getPesototal() {
//		return pesototal;
//	}
//	public static void setPesototal(double pesototal) {
//		Bolsa.pesototal = pesototal;
//	}
	public Bolsa(int numero, int peso) {
		super();
		this.numero = numero;
		this.peso = peso;
	}
	
	//genero el constructor
	
	

}
