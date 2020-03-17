package es.avalon.Clases9Polimorfismo;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {

		ArrayList<Deportista> deportistas = new ArrayList<Deportista>();
		deportistas.add(new Deportista("Moises", 35, "Futbol"));
		deportistas.add(new Deportista("Moises1", 36, "Futbol"));
		deportistas.add(new Deportista("Moises2", 37, "Futbol"));
		deportistas.add(new Deportista("Moises3", 38, "Futbol"));
		deportistas.add(new Deportista("Moises4", 39, "Futbol"));

		for (Deportista deportista : deportistas) {
			System.out.println(deportista.getNombre() + " " + deportista.getEdad() + " " + deportista.getDeporte());
		}
		System.out.println();

		ArrayList<Persona> personas = new ArrayList<Persona>();
		personas.add(new Deportista("Moises", 1, "Futbol"));
		personas.add(new Deportista("Moises1", 1, "Futbol"));
		personas.add(new Deportista("Moises2", 1, "Futbol"));
		personas.add(new Deportista("Moises3", 1, "Futbol"));
		personas.add(new Deportista("Moises4", 1, "Futbol"));

		for (Persona persona : personas) {
			System.out.println(persona.getNombre());
		}

		Persona persona = new Persona("Antonio", 1);
		Persona persona1 = new Persona("Carlota", 1);
		personas.add(persona);
		personas.add(persona1);

		recorrerListaPersonas(personas);
		System.out.println("La persona mas mayor es " + quienEsMayor(personas).getNombre() + " con " + quienEsMayor(personas).getEdad());
		System.out.println("La suma de edades es de " + sumaEdades(personas));
	}

	public static void recorrerListaPersonas(ArrayList<Persona> lista) {
		System.out.println();
		for (Persona persona : lista) {
			System.out.println(persona.getNombre() + " " + persona.getEdad());
			persona.andar();

		}
	}

	public static int sumaEdades(ArrayList<Persona> listaPersonas) {
		int contador = 0;
		for (Persona i : listaPersonas) {
			contador = contador + i.getEdad();
		}
		return contador;
	}

	public static Persona quienEsMayor(ArrayList<Persona> lista) {
		Persona persona = lista.get(0);
		for (Persona i : lista) {
			if (i.getEdad() > persona.getEdad()) {
				persona = i;
			}
		}
		return persona;
	}

}
