package es.avalon.interfaces3;

public class Caldera implements ElementoCasa {

	private boolean encendido;
	
	public boolean isEncendido() {
		return encendido;
	}

	@Override
	public void pulsar() {
		
		// boton pulsar: si esta encendido pasamelo a apagado y al reves
		if (isEncendido()) {
			encendido=false;
			
		}else {
			encendido=true;
		}
		
		System.out.println("estado caldera:"+ isEncendido());
	}
}


