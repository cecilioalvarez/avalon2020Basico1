package Clase6Composicion3.bombillas;

public class Habitacion {
	private String nombre;
	private Bombilla bombilla;
	private Bombilla bombilla2;
	
	
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
	public Habitacion() {
		super();

	}



}
