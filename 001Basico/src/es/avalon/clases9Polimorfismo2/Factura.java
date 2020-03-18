package es.avalon.clases9Polimorfismo2;

public abstract class Factura {

	private int numero;
	private String factura;
	private double importe;
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getFactura() {
		return factura;
	}
	public void setFactura(String factura) {
		this.factura = factura;
	}
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	
	public Factura(int numero, String factura, int importe) {
		super();
		this.numero = numero;
		this.factura = factura;
		this.importe = importe;
	}
	
	public abstract double CalcularIVA();

	
}
