package es.avalon.clases9.polimorfismoFacturas;

//HIJAS
//FacturaNormal 21%IVA
//FacturaReducida 7%IVA
//FacturaSinIVA 0%IVA
public class Factura {
	
	private int numero;
	private String concepto;
	private int importe;
	
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
	public int getImporte() {
		return importe;
	}
	public void setImporte(int importe) {
		this.importe = importe;
	}
	
	//Constructor
	public Factura(int numero, String concepto, int importe) {
		super();
		this.numero = numero;
		this.concepto = concepto;
		this.importe = importe;
	}
	
	//metodo getImporteConIVA()
	public double getImporteConIVA() {
		return this.getImporte()*1.21;
	}

	
	
	
	
	

}
