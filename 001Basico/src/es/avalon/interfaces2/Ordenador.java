package es.avalon.interfaces2;

public class Ordenador implements ElementoCasa {

	private boolean encendido;

	public boolean isEncendido() {
		return encendido;
	}

	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}

	public Ordenador(boolean encendido) {
		super();
		this.encendido = encendido;
	}
	
	public Ordenador() {
		
	}
	
	public void OnOff (boolean encendido) {
		System.out.println("estado ordenador -> " +isEncendido());
	}
}
