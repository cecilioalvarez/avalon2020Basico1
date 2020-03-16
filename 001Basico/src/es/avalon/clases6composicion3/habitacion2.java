package es.avalon.clases6composicion3;

public class habitacion2 {

	private String nombre;
	private bombilla2 bombilla2;

	public bombilla2 getBombilla2() {
		return bombilla2;
	}

	public void setBombilla2(bombilla2 bombilla2) {
		this.bombilla2 = bombilla2;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public habitacion2(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	
}
