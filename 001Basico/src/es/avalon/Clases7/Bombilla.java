package es.avalon.Clases7;

public class Bombilla {

	private boolean encendida;

	public Bombilla(boolean encendida) {
		super();
		this.encendida = encendida;
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
