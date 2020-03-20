package clase10_Diccionario;

public class Factura {

	private int numero;
	private String concepto;
	private double precio;
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
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public Factura(int numero, String concepto, double precio) {
		super();
		this.numero = numero;
		this.concepto = concepto;
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Factura [numero=" + numero + ", concepto=" + concepto + ", precio=" + precio + "]";
	}
	
}
