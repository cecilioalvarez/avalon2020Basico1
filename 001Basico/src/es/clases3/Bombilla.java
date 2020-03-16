package es.clases3;

public class Bombilla {
	private boolean bombilla;

	public boolean isBombilla() {
		return bombilla;
	}

	public void setBombilla(boolean bombilla) {
		this.bombilla = bombilla;
	}

	// constructor
	public Bombilla(boolean bombilla) {
		super();
		this.bombilla = bombilla;
	}

	// puede tener funcionalidad que apoye en trabajo
	// dos metodos , uno lo enciende true,
	// y el otro lo apaga false
	public void encender() {
		this.setBombilla(true);
	}

	public void apagado() {
		this.setBombilla(false);
	}

	
}
