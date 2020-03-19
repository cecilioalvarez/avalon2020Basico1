package es.avalon.interfaces2;

public class Television implements ElementoCasa{
	
	private boolean encendido;

	public boolean isEncendido() {
		return encendido;
	}

	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}

	public Television() {

	}
	
	@Override
	public void apagar() {
		this.encendido = false;
		System.out.println("La television se apaga");
	}
	@Override
	public void encender() {
		this.encendido = true;
		System.out.println("La television se apaga");
	}
	@Override
	public boolean estado() {
		return encendido;
	}
	
	
	
	
	

}
