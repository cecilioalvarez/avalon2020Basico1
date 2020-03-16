package es.avalon.clases6composicion3;

//Habitacion
//Bombilla
//Poder encender la bombilla de la habitacion desde Principal
public class Habitacion {
	
	private String nombre;
	
	private Bombilla bombilla;
	
	
	//Getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Bombilla getBombilla() {
		return bombilla;
	}

	public void setBombilla(Bombilla bombilla) {
		this.bombilla = bombilla;
	}


	//Constructor
	public Habitacion(String nombre) {
		super();
		this.nombre = nombre;
	}

	public Habitacion() {
		super();
	}
	
	
	
}
