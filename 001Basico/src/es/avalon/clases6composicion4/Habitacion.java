package es.avalon.clases6composicion4;

public class Habitacion {

	private String nombre;

	
	private Bombilla bombilla1;
	private Bombilla bombilla2;
	
	
	public Bombilla getBombilla2() {
		return bombilla2;
	}

	public void setBombilla2(Bombilla bombilla2) {
		this.bombilla2 = bombilla2;
	}

	public Bombilla getBombilla1() {
		return bombilla1;
	}

	public void setBombilla1(Bombilla bombilla) {
		this.bombilla1 = bombilla;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Habitacion(String nombre) {
		super();
		this.nombre = nombre;
	}

	public Habitacion() {
		super();
	}
	
}
