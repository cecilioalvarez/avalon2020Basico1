package Clase6Composicion3.bombillasArray;

import java.util.ArrayList;

public class Principal1 {
	public static void main(String[] args) {

		Habitacion1 h = new Habitacion1();

		Bombilla b1 = new Bombilla(true);
		Bombilla b2 = new Bombilla(false);

		h.addBombilla(b1);
		h.addBombilla(b2);
		System.out.println(encendidas(h));
	}

	private static void mostrarBombillas(Habitacion1 h) {
		ArrayList<Bombilla> bombillas = h.getBombillas();
		for (int i = 0; i < bombillas.size(); i++) {
			System.out.println(bombillas.get(i).isOn());
		}
	}

	private static int encendidas(Habitacion1 h) {
		int contador = 0;
		ArrayList<Bombilla> bombillas = h.getBombillas();
		for (int i = 0; i < bombillas.size(); i++) {
			System.out.println(bombillas.get(i).isOn());
		}
		return contador;
	}

}