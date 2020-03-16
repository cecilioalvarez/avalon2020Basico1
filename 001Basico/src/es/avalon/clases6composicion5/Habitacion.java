package es.avalon.clases6composicion5;

import java.util.ArrayList;

public class Habitacion {

	private String nombre;
	//Listado de bombillas
	private ArrayList<Bombilla> bombillas =new ArrayList<Bombilla>();
	
	//Getter y setter de bombillas
	public ArrayList<Bombilla> getBombillas() {
		return bombillas;
	}
	public void setBombillas(ArrayList<Bombilla> bombillas) {
		this.bombillas = bombillas;
	}
	//Getter y setter de nombre
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	//Constructor
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
