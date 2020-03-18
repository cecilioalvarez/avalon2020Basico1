package es.avalon.clases10Interfaces3;

public class Ordenador implements ElementoCasa {

	private boolean encendido;

	public boolean isEncendido() {
		return encendido;
	}

	@Override
	public void pulsar() {
		if (isEncendido()) {
			//Si esta encendido pasamelo a apagado
			encendido=false;
		}
		else {
			//Si esta apagado pasalo a encendido
			encendido=true;
		}
		System.out.println("El ordenador esta: "+isEncendido());
	}
	
}
