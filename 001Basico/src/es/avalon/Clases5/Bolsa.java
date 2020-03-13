package es.avalon.Clases5;

public class Bolsa {

	private String codigo;
	private int peso;
	private static int pesoTotal;

	public Bolsa(String codigo, int peso) {
		super();
		this.codigo = codigo;
		this.peso = peso;
		Bolsa.pesoTotal = pesoTotal + peso;
	}

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

	public static void getPesoTotal() {
		System.out.println("El peso total es de " + Bolsa.pesoTotal + " gramos");
	}

	public void esMayorQue(Bolsa otra) {

		if (this.getPeso() > otra.getPeso()) {
			System.out.println(this.getCodigo() + " es mayor que " + otra.getCodigo());
		} else if (this.getPeso() == otra.getPeso()) {
			System.out.println(this.getCodigo() + " es igual que " + otra.getCodigo());
		} else {
			System.out.println(this.getCodigo() + " es menor que " + otra.getCodigo());
		}
	}

}
