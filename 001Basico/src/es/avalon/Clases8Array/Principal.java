package es.avalon.Clases8Array;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {

		Habitacion habitacion = new Habitacion();
		Bombilla bombilla = new Bombilla(true,"bombilla1");
		Bombilla bombilla2 = new Bombilla(true,"bombilla2");
		Bombilla bombilla3 = new Bombilla(true,"bombilla2");
		Bombilla bombilla4 = new Bombilla(false,"bombilla2");
		
		habitacion.addBombilla(bombilla);
		habitacion.addBombilla(bombilla2);
		habitacion.addBombilla(bombilla3);
		habitacion.addBombilla(bombilla4);
		
		ArrayList<Bombilla> bombillas = habitacion.getBombillas();
		habitacion.mostrarBombillas(bombillas);
		habitacion.numeroBombillasOn(bombillas);

	}


}
