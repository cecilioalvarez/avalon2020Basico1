package es.avalon.clases4;

public class ejemplar {

	private int codigo;
	private double peso;
	private static double pesototal;
	

	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public static double getPesototal() {
		return pesototal;
	}
	public static void setPesototal(double pesototal) {
		ejemplar.pesototal = pesototal;
	}
	public ejemplar(int codigo, double peso) {
		super();
		this.codigo = codigo;
		this.peso = peso;
		// operacion estatica
		ejemplar.pesototal=pesototal+peso;
	}
	
	}
	
	
	

