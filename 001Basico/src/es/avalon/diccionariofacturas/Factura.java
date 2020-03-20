package es.avalon.diccionariofacturas;

public class Factura {

	private int numero;
	private String concepto;
	private int importe;
	
	
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
	public int getImporte() {
		return importe;
	}
	public void setImporte(int importe) {
		this.importe = importe;
	}
	
	public Factura(int numero, String concepto, int importe) {
		super();
		this.numero = numero;
		this.concepto = concepto;
		this.importe = importe;
	}
	@Override
	public String toString() {
		return "Factura [numero=" + numero + ", concepto=" + concepto + ", importe=" + importe + "]";
	}
	
}
