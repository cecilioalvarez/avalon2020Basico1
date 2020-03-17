package es.avalon.clases91Polimorfismo;

import java.util.ArrayList;

public class Principal5 {

	public static void main(String[] args) {

		Deportista d1 = new Deportista("pedro", 20, "tenis");
		Deportista d2 = new Deportista("angel", 30, "futbol");
		Deportista d3 = new Deportista("maria", 50, "tenis");
		Deportista d4 = new Deportista("ana", 15, "padel");

		ArrayList<Persona> lista = new ArrayList<Persona>();

		lista.add(d1);
		lista.add(d2);
		lista.add(d3);
		lista.add(d4);

		Persona p1 = new Persona("antonio", 20);
		Persona p2 = new Persona("carlota", 30);

		lista.add(p1);
		lista.add(p2);
		
		recorrerListaPersonas(lista);

	}
	//en este metodo el que lo construye no necesita
	//saber que existene deportista solo usa el conecpto de persona
	public static void recorrerListaPersonas(ArrayList<Persona> lista) {

		for (Persona persona : lista) {

			System.out.println(persona.getNombre());
			System.out.println(persona.getEdad());
			persona.andar();

		}
	}

}
