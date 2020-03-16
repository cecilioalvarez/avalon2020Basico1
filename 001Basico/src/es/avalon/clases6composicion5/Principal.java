package es.avalon.clases6composicion5;

import java.util.ArrayList;

//La bombilla no tendria porque tener relacion bidireccional con la habitacion
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Habitacion h1 = new Habitacion();

		Bombilla b1 = new Bombilla(true);
		Bombilla b2 = new Bombilla(false);
		Bombilla b3 = new Bombilla(true);
		
		h1.addBombilla(b1);
		h1.addBombilla(b2);
		h1.addBombilla(b3);
		
		mostrarBombillas(h1);
		System.out.println(contadorEncendidas(h1));
	}
	
	private static void mostrarBombillas(Habitacion h) {
		ArrayList<Bombilla> bombillas = h.getBombillas();
		
		for (int i=0; i<bombillas.size(); i++) {
			System.out.println(bombillas.get(i).isEncendido());
		}
	}
	
	
	
	//Cuantas bombillas hay encendidas en la habitacion?
	
	public static int contadorEncendidas(Habitacion h) {

		int contador = 0;
		ArrayList<Bombilla> bombillas = h.getBombillas();
		
		for (int i=0; i<bombillas.size(); i++) {
			if (bombillas.get(i).isEncendido() == true); {
				contador++;
			}
		}
		return contador;
	}
}


