package es.avalon.clases10Interfaces3;

public class Caldera implements ElementoCasa {
	
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
		System.out.println("La caldera esta: "+isEncendido());
	}

	

}
