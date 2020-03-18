package es.avalon.interfaces2;

public class Caldera implements ElementoCasa {

	private boolean encendido;

	public boolean isEncendido() {
		return encendido;
	}

	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}

	public Caldera(boolean encendido) {
		super();
		this.encendido = encendido;
	}
	
	public void OnOff (boolean encendido) {
		System.out.println("estado caldera -> " +isEncendido());
	}
}
