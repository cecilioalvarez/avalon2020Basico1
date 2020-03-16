package es.avalon.clases6composicion3;

public class Bombilla {
	
	private boolean encendida;

	public boolean estaEncendida() {
		return encendida;
	}

	public void setEncendida(boolean encendida) {
		this.encendida = encendida;
	}

	public Bombilla(boolean encendida) {
		super();
		this.encendida = encendida;
	}
	
	//añadiendo funcionalidad extra que igual no siempre es necesaria 
	//pero ayuda a simplificar el problema
	public void encender() {
		this.setEncendida(true);
	}
	
	public void apagar() {
		this.setEncendida(false);
	}

	
}
