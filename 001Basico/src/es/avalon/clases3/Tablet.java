package es.avalon.clases3;

public class Tablet {
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
		
		public double getPrecioConIva() {
			return precio * 1.21;
			
		}
		public double getPrecioConIva() {
			return precio + porcentaje*(precio/100);
			
		}
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public Tablet(String marca, int precio) {
		super();
		this.marca = marca;
		this.precio = precio;
	}
	
	
	
	

}
