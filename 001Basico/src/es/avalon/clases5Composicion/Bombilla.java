package es.avalon.clases5Composicion;

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

	public void encender() {
		
		this.setEncendida(true);
	}

	public void apagar() {
		
		this.setEncendida(false);
	}

	
	
	
	

}
