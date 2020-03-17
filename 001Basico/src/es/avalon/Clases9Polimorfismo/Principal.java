package es.avalon.Clases9Polimorfismo;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {

		ArrayList<Persona> personas = new ArrayList<Persona>();
		personas.add(new Deportista("Moises", 1, "Futbol"));
		personas.add(new Deportista("Ana", 70, "Futbol"));
		personas.add(new Deportista("Domi", 1, "Futbol"));
		personas.add(new Deportista("Emilio", 67, "Futbol"));
		personas.add(new Deportista("Monica", 1, "Futbol"));
		Persona persona = new Persona("Pedro", 80);
		Persona persona1 = new Persona("Teresa", 1);
		personas.add(persona);
		personas.add(persona1);

		recorrerListaPersonas(personas);

		System.out.println("La persona mas mayor es " + quienEsMayor(personas).getNombre() + " con "
				+ quienEsMayor(personas).getEdad());
		System.out.println("La suma de edades es de " + sumaEdades(personas));

		recorrerListaPersonas(listaJubilados(personas));

		sumarNumeroEdad(personas, 1);

	}

	public static void sumarNumeroEdad(ArrayList<Persona> lista, int numero) {
		int edad;
		for (Persona i : lista) {
			edad = i.getEdad();
			edad = edad + numero;
			i.setEdad(edad);
		}
	}

	public static ArrayList<Persona> listaJubilados(ArrayList<Persona> lista) {
		ArrayList<Persona> jubilados = new ArrayList<Persona>();
		for (Persona i : lista) {
			if (i.getEdad() > 65) {
				jubilados.add(i);
			}
		}
		return jubilados;

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
