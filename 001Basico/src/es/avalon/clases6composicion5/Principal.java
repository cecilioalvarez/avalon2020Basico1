package es.avalon.clases6composicion5;

import java.util.ArrayList;

public class Principal {

public static void main(String[] args) {
		
		Habitacion h= new Habitacion(null);
		
		crearBombillas(h);
		
		mostrarBombillas(h);
		
		System.out.println(encendidas(h));
		
	}


	private static void mostrarBombillas(Habitacion h) {
		ArrayList<Bombilla> bombillas=h.getBombillas();
		
		for (int i=0;i<bombillas.size();i++) {
			
			System.out.println(bombillas.get(i).estaEncendida());
		}
	}
	private static int encendidas(Habitacion h) {
		int contador=0;
		ArrayList<Bombilla> bombillas=h.getBombillas();
		
		for (int i=0;i<bombillas.size();i++) {
			
			if (bombillas.get(i).estaEncendida()) {
				
				contador++;
			}
		}
		return contador;
	}
	private static void crearBombillas(Habitacion h) {
		Bombilla b1= new Bombilla(true);
		Bombilla b2= new Bombilla(false);
		
		
		//infinita de bombillas
		h.addBombilla(b1);
		h.addBombilla(b2);
	}
}
