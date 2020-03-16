package es.avalon.clases6composicion3;

public class bombilla {

	private boolean on;

	// get como si fuera un is (estaEncendida)
	public boolean isOn() {
		return on;
	}
	// porque es el de asignacion
	public void setOn(boolean on) {
		this.on = on;
	}

	public bombilla(boolean on) {
		super();
		this.on = on;
	}
	
	
	///////////
	// toda clase puede tener funcionalidad que nos apoye a la hora de trabajar
	
	// pone el estado a ture
	public void encender() {
		
		this.setOn(true);
	}

	// el otro pone el estado a false
	public void apagar() {
		
		this.setOn(false);
	}
}
