package Clase6Composicion3.bombillas;

import java.util.ArrayList;

public class Habitacion {
	private String nombre;

	
	private ArrayList<Bombilla> bombillas = new ArrayList<Bombilla>();


	private Bombilla bombilla;
	private Bombilla bombilla2;
	
	
	public Bombilla getBombilla2() {
		return bombilla2;
	}
	public void setBombilla2(Bombilla bombilla2) {
		this.bombilla2 = bombilla2;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public ArrayList<Bombilla> getBombillas() {
		return bombillas;
	}
	public Bombilla getBombilla() {
		return bombilla;

	}


	public void setBombillas(ArrayList<Bombilla> bombillas) {
		this.bombillas = bombillas;

	}
	public void setBombilla(Bombilla bombilla) {
		this.bombilla = bombilla;
	}

	public Habitacion() {
		super();

	}



	public void addBombilla(Bombilla b) {

		this.bombillas.add(b);
	}

}
