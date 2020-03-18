package es.clases4;

public abstract class Factura {
	//para trabajar con clases abstractas como coche dentro de BMV, Mercedes, Seat. +
	//o como factura es abstracta frente a las facturas con tipos e iva
	// pones abstrac class para reutilizar sin problemas
	private int numero;
	private String concepto;
	private double importe;

	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
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
	
	public Factura(int numero, String concepto, double importe) {
		super();
		this.numero = numero;
		this.concepto = concepto;
		this.importe = importe;
	}
	
	public double conIVA () {
	return getImporte()*1.21;
}
}
