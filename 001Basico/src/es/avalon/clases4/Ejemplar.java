package es.avalon.clases4;

public class Ejemplar {

	private int codigo;
	private int peso;
	private static int pesoTotal;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public static int getPesoTotal() {
		return pesoTotal;
	}
	public static void setPesoTotal(int pesoTotal) {
		Ejemplar.pesoTotal = pesoTotal;
	}
	public Ejemplar(int codigo, int peso) {
		super();
		this.codigo = codigo;
		this.peso = peso;
		//operacion estatica
		
		//acumular
		Ejemplar.pesoTotal=pesoTotal+peso;
	}
}
