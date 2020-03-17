package es.avalon.clases8Polimorfismo;

import java.util.ArrayList;

public class Principal5Sumaedades {

	//Sumar todas las edades de la lista
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

		System.out.println(sumaTodasEdades(lista));

	}
	
	public static int sumaTodasEdades(ArrayList<Persona> lista) {

		// obtengo el primer elemento de la lista
		int sumaedad=0;
		for (Persona persona : lista) {
			// Si la edad del que tengo es menor de la edad con el que compruebo pues
			// asigname el que compruebo
			sumaedad=sumaedad+persona.getEdad();
			}

		return sumaedad;
	}
}