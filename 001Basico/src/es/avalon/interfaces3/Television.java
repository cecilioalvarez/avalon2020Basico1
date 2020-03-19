package es.avalon.interfaces3;

public class Television implements ElementoCasa{
	
	private boolean encendido;

	public boolean isEncendido() {
		return encendido;
	}


	public Television() {

	}
	
	@Override
	public void pulsar() {
		if (isEncendido()) {
			encendido = false;
		}else {
			encendido=true;
		}
		
		System.out.println("Television estado:" + isEncendido());
	}


	
	
	
	
	

}
