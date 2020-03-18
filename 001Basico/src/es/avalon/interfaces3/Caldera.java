package es.avalon.interfaces3;

public class Caldera implements ElementoCasa {

	private boolean encender;

	public boolean isEncender() {
		return encender;
	}

	@Override
	public void pulsar() {
		
		if (isEncender()) {

			encender = false;
		} else {
			encender = true;
		}
		
		System.out.println ("caldera estado:"+ isEncender());
	}

}
