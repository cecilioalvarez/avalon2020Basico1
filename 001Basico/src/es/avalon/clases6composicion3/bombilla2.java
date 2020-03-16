package es.avalon.clases6composicion3;

public class bombilla2 {

	private boolean encendida;

	public boolean isEncendida() {
		return encendida;
	}

	public void setEncendida(boolean encendida) {
		this.encendida = encendida;
	}

	public bombilla2(boolean encendida) {
		super();
		this.encendida = encendida;
	}
	
	// añadiendo funcionalidad extra que igual no siempre es necesaria
	// pero que ayuda a generar un rpograma principal mas sencillo
	
	public void encender() {
		
		this.setEncendida(true);
	}
	
	public void apagar() {
		this.setEncendida(false);
	}
}
