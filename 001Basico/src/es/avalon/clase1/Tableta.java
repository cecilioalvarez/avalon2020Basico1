package es.avalon.clase1;

public class Tableta {
	private String marca;
	private int precio;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public Tableta(String marca, int precio) {

		this.marca = marca;
		this.precio = precio;
	}
	public double getPrecioConIVA() {
	return precio*1.21;	
	}
	public double getPrecioConIVA(int porcentaje) {
		return precio+porcentaje*(precio/100);	
	
	
	}

	public Tableta(int precio) {
		
		this.marca = "apple";
		this.precio = precio;
		
	}
	
	
}