package es.avalon.clases5;

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
	public double calcularIVA() {
		//delega en el metodo estatico
		//no hace el la operacion por su cuenta
		return calcularIVA(this.getImporte())
				;
		
	}
	//statico
	public static double calcularIVA(double valor) {
		return valor*1.21;
		
	}
	
	
	

}
