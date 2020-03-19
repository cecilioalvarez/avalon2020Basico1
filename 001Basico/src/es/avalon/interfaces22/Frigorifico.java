package es.avalon.interfaces22;

public class Frigorifico implements ElementoCasa {

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
		System.out.println("el frigorifico se enciende");
		
	}

	@Override
	public void apagar() {
		this.encendido=false;
		System.out.println("el frigorifico se apaga");
		
	}
	
	

}
