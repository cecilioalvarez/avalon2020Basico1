package es.avalon.Clases2;

public class Tableta {

	private String marca;
	private double precio;
	
	public double getPrecioConIVA() {
		return precio *1.21;
	}
	public double getPrecioConIVA(int porcentaje) {
		return precio + (precio/100)*porcentaje;
	}
	
	public Tableta(String marca, int precio) {
		this.marca = marca;
		this.precio = precio;
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	
}
