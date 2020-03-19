package es.avalon.interfaces2;

public class Ordenador implements ElementoCasa{
	
	private boolean encendido;

	public boolean isEncendido() {
		return encendido;
	}

	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}

	public Ordenador() {
	}
	
	@Override
	public void apagar() {
		this.encendido = false;
		System.out.println("El ordenador se apaga");
	}
	@Override
	public void encender() {
		this.encendido = true;
		System.out.println("El ordenador se enciende");
	}
	
	//Tambien se podría haber aprovechado el anterior isEncendido()
	@Override
	public boolean estado() {
		return encendido;
	}
	
	

}
