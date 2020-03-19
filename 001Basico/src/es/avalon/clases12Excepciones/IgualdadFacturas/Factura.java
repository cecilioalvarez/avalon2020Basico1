package es.avalon.clases12Excepciones.IgualdadFacturas;

public class Factura {
	
	//clave primaria numero
	//metodo contar numero de facturas con mismo numero
	private int numero;
	private double importe;
	private String concepto;
	
	//Getter y setters
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
	public String getConcepto() {
		return concepto;
	}
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	
	//Constructor
	public Factura(int numero, double importe, String concepto) {
		super();
		this.numero = numero;
		this.importe = importe;
		this.concepto = concepto;
	}
	//Constructor con solo el numero
		public Factura(int numero) {
			super();
			this.numero = numero;
		}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numero;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Factura other = (Factura) obj;
		if (numero != other.numero)
			return false;
		return true;
	}
		
	}
	
	

