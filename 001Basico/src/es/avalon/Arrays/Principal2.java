package es.avalon.Arrays;

import java.util.ArrayList;

public class Principal2 {

	public static void main(String[] args) {

		Habitacion habitacion = new Habitacion();

		habitacion.addBombilla(new Bombilla(true, "bombilla1"));
		habitacion.addBombilla(new Bombilla(false, "bombilla2"));
		habitacion.addBombilla(new Bombilla(true, "bombilla3"));
		habitacion.addBombilla(new Bombilla(false, "bombilla4"));
		
		ArrayList<Integer> lista = new ArrayList<Integer>();
		lista.add(3);
		lista.add(2);
		lista.add(7);
		
		for(Integer i: lista) {
			System.out.println(i);
		}

		habitacion.mostrarBombillas(habitacion);
		habitacion.numeroBombillasOn(habitacion);

	}

}
