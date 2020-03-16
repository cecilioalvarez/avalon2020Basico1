package es.avalon.clases6composicion3;

public class Habitacion {

	private String nombre;
	private Bombilla bombilla;
	
	public Bombilla getBombilla() {
		return bombilla;
	}

	public void setBombilla(Bombilla bombilla) {
		this.bombilla = bombilla;
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
