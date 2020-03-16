package Clase6Composicion3;

public class Bombilla {

	private boolean on;

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	public Bombilla(boolean on) {
		super();
		this.on = on;
	}
	
	public void encender() {
		this.setOn(true);
	}
	public void apagar() {
		this.setOn(false);
	}

}
