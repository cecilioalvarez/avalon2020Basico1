package es.avalon.clases4;

public class Factura {

	
	private int numero;
	private double importe;
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	
	public Factura(int numero, double importe) {
		super();
		this.numero = numero;
		this.importe = importe;
	}
	//calculamos el IVA a traves del metodo estatico
	public double calcularIVA() {
		return calcularIVA(this.getImporte());
	}
	
	//metodo estatico
	public static double calcularIVA(double valor) {
		return valor*1.21;
	}
}
