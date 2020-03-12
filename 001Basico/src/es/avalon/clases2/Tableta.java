package es.avalon.clases2;

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

	public double getPrecioConIVA() {
		return precio * 1.21;
	}

	// Overload
	public double getPrecioConIVA(int porcentaje) {
		return precio - porcentaje * (precio / 100);
	}

	public Tableta(String marca, int precio) {

		this.setMarca(marca);
		this.setPrecio(precio);
	}
	//sobrecarga de constructores [Solo asigna un parametro]
	public Tableta( int precio) {

		this.setPrecio(precio);
		this.marca="apple";
	}

}
