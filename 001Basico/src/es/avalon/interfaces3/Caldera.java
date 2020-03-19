package es.avalon.interfaces3;

public class Caldera implements ElementoCasa{
	
	private boolean encendido;

	public boolean isEncendido() {
		return encendido;
	}

	public Caldera() {

	}

	@Override
	public void pulsar() {
		if (isEncendido()) {
			encendido = false;
		}else {
			encendido=true;
		}
		
		System.out.println("Caldera estado:" + isEncendido());
	}
	
	
}
