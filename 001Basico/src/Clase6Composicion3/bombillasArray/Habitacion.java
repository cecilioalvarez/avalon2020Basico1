package Clase6Composicion3.bombillasArray;

import java.util.ArrayList;



public class Habitacion {
	private String nombre;
	private ArrayList<Bombilla> bombillas= new ArrayList<Bombilla>();

	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	

	public Habitacion() {
		super();

	}

	public void addBombilla(Bombilla b) {

		this.bombillas.add(b);
	}

	public ArrayList<Bombilla> getBombillas() {
		return bombillas;
	}

	public void setBombillas(ArrayList<Bombilla> bombillas) {
		this.bombillas = bombillas;
	}

}
