package es.avalon.clases6composicion5;

import java.util.ArrayList;

public class Principal2 {

	public static void main(String[] args) {

		Habitacion h = new Habitacion("salon");

		Bombilla b1 = new Bombilla(false);
		Bombilla b2 = new Bombilla(true);

		// Añado infinitas bombillas
		h.addBombilla(b1);
		h.addBombilla(b2);
		
		mostrarBombillas(h);
		System.out.println(encendidas(h));
	}

	private static void mostrarBombillas(Habitacion h) {
		ArrayList<Bombilla> bombillas = h.getBombillas();

		for (int i = 0; i < bombillas.size(); i++) {
			System.out.println(bombillas.get(i).estaEncendida());
		}
	}

	private static int encendidas(Habitacion h) {
		int contador = 0;
		ArrayList<Bombilla> bombillas = h.getBombillas();
		for (int i = 0; i < bombillas.size(); i++) {
			if (bombillas.get(i).estaEncendida()==true)
				contador = contador + 1;
		}
		return contador;
	}
	
}
