package es.avalon.Clases8;

public class Habitacion {

	private Bombilla bombilla;
	private Bombilla bombilla2;
	private String nombre;

	public Habitacion(Bombilla bombilla,Bombilla bombilla2,String nombre) {
		super();
		this.bombilla = bombilla;
		this.bombilla2 = bombilla2;
		this.nombre = nombre;
	}

	public Bombilla getBombilla2() {
		return bombilla2;
	}

	public void setBombilla2(Bombilla bombilla2) {
		this.bombilla2 = bombilla2;
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
