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

	// es identico
	public double getPrecioConIVA() {

		return precio * 1.21;
	}

	// este otro
	//funcion por que recibe y devuelve
	public double getPrecioConIVA(int porcentaje) {

		return precio + porcentaje * (precio / 100);
	}
	//metodo
	// procedimiento
	public void setPrecio(int precio) {

		this.precio = precio;
	}

	// metodo 2 parametros
	// metodo= funcion || procedimiento
	public Tableta(String marca, int precio) {

		this.marca = marca;
		this.precio = precio;
	}
	// 1 parametro el otro se asigna
	public Tableta(int precio) {
		
		this.precio = precio;
		this.marca = "apple";
	}

}
