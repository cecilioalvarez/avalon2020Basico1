package es.avalon.excepciones.igualdadfacturas;

public class Factura {

	private int numero;
	private String cocepto;
	private double importe;
	
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCocepto() {
		return cocepto;
	}
	public void setCocepto(String cocepto) {
		this.cocepto = cocepto;
	}
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	
	
	public Factura(int numero, String cocepto, double importe) {
		super();
		this.numero = numero;
		this.cocepto = cocepto;
		this.importe = importe;
	}
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
