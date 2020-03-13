package es.avalon.clases4;

public class Ejemplar {
	
	private String codigo;
	private int peso;
	
	private static int pesoTotal = 0;
	
	//Getters y setters
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
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
	public Ejemplar(String codigo, int peso) {
		super();
		this.codigo = codigo;
		this.peso = peso;
		//Operacion estatica
		Ejemplar.pesoTotal = pesoTotal + peso;
	}
	
	

}
