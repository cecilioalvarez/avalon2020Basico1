package es.avalon.clases6composicion3;

public class habitacion {

	private String nombre;
	private bombilla bombilla;

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public bombilla getBombilla() {
		return bombilla;
	}

	public void setBombilla(bombilla bombilla) {
		this.bombilla = bombilla;
	}

	public habitacion(String nombre, es.avalon.clases6composicion3.bombilla bombilla) {
		super();
		this.nombre = nombre;
		this.bombilla = bombilla;
	}

	
	
	
}
