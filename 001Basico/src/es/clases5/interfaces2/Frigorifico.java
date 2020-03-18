package es.clases5.interfaces2;

public class Frigorifico implements ElementoCasa {

	private boolean encender;

	@Override
	public void interruptor() {
		// TODO Auto-generated method stub
		if (isEncender()) {
			encender = false;
		} else {
			encender = true;
		}
		System.out.println("frigo estado:" + isEncender());

	}

	@Override
	public boolean isEncender() {
		// TODO Auto-generated method stub
		return this.encender;
	}

}
