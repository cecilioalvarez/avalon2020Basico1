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

	
	public Tableta(String marca, int precio) {

		this.setMarca(marca);
		this.setPrecio(precio);
	}
	


}
