package es.avalon.clases6composicion5;

import java.util.ArrayList;

public class Principal2 {

	public static void main(String[] args) {

		Habitacion h = new Habitacion("Salon");

		Bombilla b1 = new Bombilla(true);
		Bombilla b2 = new Bombilla(true);
		
		
		h.addBombilla(b1);
		h.addBombilla(b2);

		ArrayList<Bombilla> bomnillas=h.getBombillas();
		
		for (int i=0; i<bombillas.size(); i++) {
			System.out.println(bombillas.get(i).estaEncendida());
		}
		
	
	}

}
