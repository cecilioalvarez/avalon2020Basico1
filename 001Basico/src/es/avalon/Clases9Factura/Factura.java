package es.avalon.Clases9Factura;

public class Factura {
	
	private int numeroFactura;
	private String concepto;
	private double importe;
	
	public Factura(int numeroFactura, String concepto, double importe) {
		super();
		this.numeroFactura = numeroFactura;
		this.concepto = concepto;
		this.importe = importe;
	}
	
	public int getNumeroFactura() {
		return numeroFactura;
	}
	public void setNumeroFactura(int numeroFactura) {
		this.numeroFactura = numeroFactura;
	}
	public String getConcepto() {
		return concepto;
	}
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	

}
