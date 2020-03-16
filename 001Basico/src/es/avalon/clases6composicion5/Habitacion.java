package es.avalon.clases6composicion5;

import java.util.ArrayList;

public class Habitacion {

	private String nombre;
	// que es un listado de bombillas
	private ArrayList<Bombilla> bombillas = new ArrayList<Bombilla>();

	public ArrayList<Bombilla> getBombillas() {
		return bombillas;
	}

	public void setBombillas(ArrayList<Bombilla> bombillas) {
		this.bombillas = bombillas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Habitacion(String nombre) {
		super();
		this.nombre = nombre;
	}

	public Habitacion() {
		super();
	}
	
	public void addBombilla(Bombilla b) {
		
		this.bombillas.add(b);
	}

}
