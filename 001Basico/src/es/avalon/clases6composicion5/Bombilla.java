package es.avalon.clases6composicion5;

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
	// añadiendo funcoinalidad extra que igual no siempre es necesaria
	// pero que ayuda a generar un programa principal mas sencillo 
	
	public void encender() {
		
		this.setEncendida(true);
	}
	
	public void apagar() {
		
		this.setEncendida(false);
	}

}
