package es.avalon.clases6composicion4;

public class habitacion {

	private String nombre;
	private bombilla bombilla1;
	private bombilla bombilla2;

	public bombilla getBombilla1() {
		return bombilla1;
	}

	public void setBombilla1(bombilla bombilla1) {
		this.bombilla1 = bombilla1;
	}

	public bombilla getBombilla2() {
		return bombilla2;
	}

	public void setBombilla2(bombilla bombilla2) {
		this.bombilla2 = bombilla2;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public habitacion(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	
}
