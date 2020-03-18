package es.avalon.clases9.polimorfismoFacturas;

//HIJAS
//FacturaNormal 21%IVA
//FacturaReducida 7%IVA
//FacturaSinIVA 0%IVA
public abstract class Factura {
	
	private int numero;
	private String concepto;
	private double importe;
	
	//Getters y setters
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
	
	//Constructor
	public Factura(int numero, String concepto, double importe) {
		super();
		this.numero = numero;
		this.concepto = concepto;
		this.importe = importe;
	}
	
	//metodo getImporteConIVA()
	public abstract double getImporteConIVA();
}
