package es.avalon.clases2;

public class Tableta {
	
	private String marca;
	private int precio;
	public String getMarca() {
		return marca;
		
	}
	public void setMarca(String marca) {
		this.marca=marca;
	}
	public int getPrecio() {
		return precio;
	}
	
	//estos 2 son iguales pero al tener el segundo el (int porcentaje) los reconoce como distintos al llamarlos desde el principal al introducir (10)
	public double getPrecioIVA() {
		return precio*1.21;
	}
	public double getPrecioIVA(int porcentaje) {
		return precio+porcentaje*(precio/100);
	}
	
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	//metodo 2 parametros(precio y marca)
	//metodo=funcion, procedimiento
	public Tableta(String marca, int precio) {
		
		this.marca = marca;
		this.precio = precio;
	}
	//metodo 1 parametro(precio) y el otro se asigna(marca-apple)
	public Tableta(int precio) {
		this.marca = "apple";
		this.precio = precio;
	}
	
	
}
