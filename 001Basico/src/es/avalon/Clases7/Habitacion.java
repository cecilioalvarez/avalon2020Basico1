package es.avalon.Clases7;

public class Habitacion {

	private Bombilla bombilla;
	private String nombre;

	public Habitacion(Bombilla bombilla,String nombre) {
		super();
		this.bombilla = bombilla;
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Bombilla getBombilla() {
		return bombilla;
	}

	public void setBombilla(Bombilla bombilla) {
		this.bombilla = bombilla;
	}

}
