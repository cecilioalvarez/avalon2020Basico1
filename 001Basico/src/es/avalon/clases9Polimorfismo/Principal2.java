package es.avalon.clases9Polimorfismo;

import java.util.ArrayList;

public class Principal2 {

	public static void main(String[] args) {

		Deportista d1 = new Deportista("pedro", 20, "tenis");

		Deportista d2 = new Deportista("ana", 25, "futbol");

		Deportista d3 = new Deportista("victor", 45, "tenis");

		Deportista d4 = new Deportista("paco", 20, "baloncesto");

		ArrayList<Deportista> lista = new ArrayList<Deportista>();

		lista.add(d1);
		lista.add(d2);
		lista.add(d3);
		lista.add(d4);

		for (Deportista undeportista : lista) {
			System.out.println(undeportista.getNombre());
		}

		ArrayList<Persona> lista2 = new ArrayList<Persona>();

		lista2.add(d1);
		lista2.add(d2);
		lista2.add(d3);
		lista2.add(d4);

		for (Persona undeportista : lista2) {
			System.out.println(undeportista.getNombre());
		}
		
		
		
		
		
	}

}
