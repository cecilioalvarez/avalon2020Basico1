package es.avalon.Clases8Array;

public class Bombilla {

	private boolean encendida;
	private String nombre;

	public Bombilla(boolean encendida, String nombre) {
		super();
		this.encendida = encendida;
		this.nombre = nombre;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean estaEncendida() {
		return encendida;
	}

	public void setEncendida(boolean encendida) {
		this.encendida = encendida;
	}

	public void encender() {
		this.encendida = true;
	}

	public void apagar() {
		this.encendida = false;
	}

}
