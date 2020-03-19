package es.avalon.Equals_Conjuntos_Diccionarios;

public class Factura {

	private int numero;
	private String concepto;
	private double importe;
	
	public Factura(int numero, String concepto, double importe) {
		super();
		this.numero = numero;
		this.concepto = concepto;
		this.importe = importe;
	}
	
	public Factura(int numero, String concepto) {
		super();
		this.numero = numero;
		this.concepto = concepto;
	}

	public Factura(int numero) {
		super();
		this.numero = numero;
	}

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((concepto == null) ? 0 : concepto.hashCode());
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
		if (concepto == null) {
			if (other.concepto != null)
				return false;
		} else if (!concepto.equals(other.concepto))
			return false;
		if (numero != other.numero)
			return false;
		return true;
	}
	


	
	
	
	
}
