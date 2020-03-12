package es.clases1;

public class tableta {
private String marca;
	public String getMarca() {
	return marca;
}
public void setMarca(String marca) {
	this.marca = marca;
}
public double getPrecio() {
	return precio;
}
public void setPrecio(double precio) {
	this.precio = precio;
}
// constructor
	private double precio;
	// constructor= metodo
	public tableta(String marca, double precio) {
		super();
		this.marca = marca;
		this.precio = precio;
	}
	
	public tableta(double precio) {
		super();
		
		this.marca = "apple";
		this.precio = precio;
	}
	
	public double getPrecioconIVA() {
		return precio*1.21;
	}
	
	public double getPrecioconIVA(int porcentaje) {
		return precio -porcentaje * (precio/100);
	}

}
//source-> geters setters