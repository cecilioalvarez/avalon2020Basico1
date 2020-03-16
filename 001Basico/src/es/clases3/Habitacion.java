package es.clases3;

public class Habitacion {
	private String NombreHabi; 

	private Bombilla bombilla;
	
	public String getNombreHabi() {
		return NombreHabi;
	}

	public void setNombreHabi(String nombreHabi) {
		NombreHabi = nombreHabi;
	}

	public Habitacion(String nombreHabi) {
		super();
		NombreHabi = nombreHabi;
	}


	public Bombilla getBombilla() {
		return bombilla;
	}

	public void setBombilla(Bombilla bombilla) {
		this.bombilla = bombilla;
	}
}
