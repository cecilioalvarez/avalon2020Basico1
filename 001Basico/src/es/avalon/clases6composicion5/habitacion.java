package es.avalon.clases6composicion5;

import java.util.ArrayList;

public class habitacion {

	private String nombre;
	
	private ArrayList<bombilla> bombillas=new ArrayList<bombilla>();
	
	public ArrayList<bombilla> getBombillas() {
		return bombillas;
	}

	public void setBombillas(ArrayList<bombilla> bombillas) {
		this.bombillas = bombillas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public habitacion(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public void addBombilla(bombilla b) {
		
		this.bombillas.add(b);
	
	}
	
	
}
