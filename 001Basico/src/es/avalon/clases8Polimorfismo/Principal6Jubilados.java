package es.avalon.clases8Polimorfismo;

import java.util.ArrayList;

public class Principal6Jubilados {

	//Sacar solo las personas jubiladas (mayores de 67)
	public static void main(String[] args) {

		Deportista d1 = new Deportista("Pepe", 75, "Futbol");
		Deportista d2 = new Deportista("Luis", 15, "Surf");
		Deportista d3 = new Deportista("Alberto", 80, "Petanca");
		Deportista d4 = new Deportista("Ines", 15, "Padel");

		ArrayList<Persona> lista = new ArrayList<Persona>();

		lista.add(d1);
		lista.add(d2);
		lista.add(d3);
		lista.add(d4);

		Persona p1 = new Persona("Maria", 25);
		Persona p2 = new Persona("Carlota", 15);
		lista.add(p1);
		lista.add(p2);

		//Declaramos una nueva variable (lista) en la que se guarda listajubilados
		ArrayList<Persona> nueva= buscarJubilados(lista);
		//Pintamos la listajubilados
		for (Persona p:nueva) {
			System.out.println(p.getNombre());
		}
	}

	public static ArrayList<Persona> buscarJubilados(ArrayList<Persona> lista) {
		ArrayList<Persona> listajubilados = new ArrayList<Persona>();
		
		for (Persona persona : lista) {
			if (persona.getEdad() >= 67) {
				listajubilados.add(persona);
			}
		}
		return listajubilados;
	}
}