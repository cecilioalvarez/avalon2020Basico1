package es.avalon.interfaces2;

public class Frigorifico implements ElementoCasa {

	private boolean encendido;

	public boolean isEncendido() {
		return encendido;
	}

	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}

	public Frigorifico(boolean encendido) {
		super();
		this.encendido = encendido;
	}
	
	public void OnOff (boolean encendido) {
		System.out.println("estado frigorifico -> " +isEncendido());
	}
}
