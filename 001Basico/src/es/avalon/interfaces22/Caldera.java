package es.avalon.interfaces22;

public class Caldera implements ElementoCasa {

	private boolean encendido;
	
	public boolean isEncendido() {
		return encendido;
	}

	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}

	@Override
	public void encender() {
		this.encendido=true;
		System.out.println("la caldera se enciende");
		
	}

	@Override
	public void apagar() {
		this.encendido=false;
		System.out.println("la caldera se apaga");
		
	}

}
