package es.avalon.clases8Polimorfismo;

import java.util.ArrayList;

public class Principal4Buscarmayor {

	public static void main(String[] args) {

		Deportista d1 = new Deportista("Pepe", 25, "Futbol");
		Deportista d2 = new Deportista("Luis", 15, "Surf");
		Deportista d3 = new Deportista("Alberto", 5, "Petanca");
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
		// recorrerListaPersonas(lista);
		Persona mayor = buscarMayor(lista);
		System.out.println(mayor.getNombre());
		System.out.println(mayor.getEdad());

	}

	// En este metodo el que lo construye no necesita saber que existen deportistas
	// // (solo usa el concepto persona)
//	public static void recorrerListaPersonas(ArrayList<Persona> lista) {
//
//		for (Persona persona : lista) {
//			System.out.println(persona.getNombre());
//			System.out.println(persona.getEdad());
//			persona.andar();
//		}
//	}

	public static Persona buscarMayor(ArrayList<Persona> lista) {

		// obtengo el primer elemento de la lista
		Persona p = lista.get(0);
		for (Persona persona : lista) {
			// Si la edad del que tengo es menor de la edad con el que compruebo pues
			// asigname el que compruebo
			if (p.getEdad() < persona.getEdad()) {
				p = persona;
			}

		}
		return p;
	}
}