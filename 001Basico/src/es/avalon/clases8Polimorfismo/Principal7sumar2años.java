package es.avalon.clases8Polimorfismo;

import java.util.ArrayList;

public class Principal7sumar2años {

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

		//Saca la lista de personas sumando 2 años
		sumar2(lista);
		
		for(Persona p:lista) {
			System.out.println(p.getNombre());
			System.out.println(p.getEdad());
		}
	}

	public static ArrayList<Persona> sumar2(ArrayList<Persona> lista) {

		for (Persona persona : lista) {
			persona.setEdad(persona.getEdad()+2);		
			}
		return lista;
	}
}