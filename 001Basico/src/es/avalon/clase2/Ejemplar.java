package es.avalon.clase2;

public class Ejemplar {
	private String codigo;
	private double peso;
	private static double pesoTotal;
	
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
	public static double getPesoTotal() {
		return pesoTotal;
	}
	public static void setPesoTotal(double pesoTotal) {
		Ejemplar.pesoTotal = pesoTotal;
	}
	public Ejemplar(String codigo, double peso) {
		
		this.codigo = codigo;
		this.peso = peso;
		pesoTotal=pesoTotal+peso;
	}
	

}
