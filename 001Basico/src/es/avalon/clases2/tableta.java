package es.avalon.clases2;

public class tableta {
	
	private String marca;
	private int precio;
	
	public String getmarca() {
		return marca;
	}

	public void setmarca(String marca) {
		this.marca=marca;
	}
	
	public int getprecio() {
		return precio;
	}
	
	// estos dos son identicos pero al tener el segundo el (int porcentaje)
	// los reconoce como distintos al llamarlos desde el principal al introducir (10)
	
	public double getprecioIVA() {
		return precio*0.21;
	}
	
	public double getprecioIVA(int porcentaje) {
		return precio+porcentaje*(precio/100);
	}
	
	public void setprecio(int precio) {
		this.precio=precio;
	}

	// metodo de 2 parametros
	// metodo=funcion/procedimiento
	public tableta(String marca, int precio) {
		
		this.marca = marca;
		this.precio = precio;
	}

	// un parametro y el otro se asigna
	// esto hara que si no le indicas marca, te pone apple por defecto
	public tableta(int precio) {
		
		this.precio = precio;
		this.marca="apple";
	}
		
	
		
		
		
		
}
