package es.avalon.Arrays;

import java.util.ArrayList;

public class Habitacion {

	private ArrayList<Bombilla> bombillas = new ArrayList<Bombilla>();
	private String nombre;

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

	public void addBombilla(Bombilla bombilla) {

		this.bombillas.add(bombilla);
	}

	public void numeroBombillasOn(Habitacion habitacion) {

		int numeroEncendidas = 0;
		for (int i = 0; i < bombillas.size(); i++) {
			if (bombillas.get(i).estaEncendida()) {
				numeroEncendidas++;
			}
		}
		System.out.println(numeroEncendidas);
	}

	public void mostrarBombillas(Habitacion habitacion) {
		for (int i = 0; i < bombillas.size(); i++) {
			System.out.println(bombillas.get(i).estaEncendida());
		}
	}
}
