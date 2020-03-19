package es.avalon.interfaces3;

public class Ordenador implements ElementoCasa{
	
	private boolean encendido;

	public boolean isEncendido() {
		return encendido;
	}

	public Ordenador() {
	}
	
	@Override
	public void pulsar() {
		if (isEncendido()) {
			encendido = false;
		}else {
			encendido=true;
		}
		
		System.out.println("Ordenador estado:" + isEncendido());
	}
	
	
	
	

}
