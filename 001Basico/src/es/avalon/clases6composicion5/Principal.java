package es.avalon.clases6composicion5;

import java.util.ArrayList;

//La bombilla no tendria porque tener relacion bidireccional con la habitacion
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Habitacion h1 = new Habitacion();

		Bombilla b1 = new Bombilla(true);
		Bombilla b2 = new Bombilla(false);
		
		h1.addBombilla(b1);
		h1.addBombilla(b2);
		
		ArrayList<Bombilla> bombillas = h1.getBombillas();
		
		for (int i=0; i<bombillas.size(); i++) {
			System.out.println(bombillas.get(i).isEncendido());
		}
	}
}
