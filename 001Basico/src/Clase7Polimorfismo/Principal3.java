package Clase7Polimorfismo;

import java.util.ArrayList;

public class Principal3 {

	public static void main(String[] args) {

		Deportista d1 = new Deportista("Juan", 30, "natacion");
		Deportista d2 = new Deportista("Jose", 31, "padel");
		Deportista d3 = new Deportista("Maria", 32, "tenis");
		Deportista d4 = new Deportista("Ines", 33, "futbol");

		ArrayList<Persona> lista = new ArrayList<Persona>();
		lista.add(d1);
		lista.add(d2);
		lista.add(d3);
		lista.add(d4);

		Persona p1 = new Persona("antonio", 70);
		Persona p2 = new Persona("carlota", 21);
		lista.add(p1);
		lista.add(p2);
		// con esto solo podria sacar nobre y edad
		// debido a que estas dos son personas

		recorrerListaPersonas(lista);
		Persona mayor = buscaMayor(lista);
		System.out.println(mayor.getNombre());
		System.out.println(mayor.getEdad());
	
		ArrayList<Persona> nueva = listaJubilados(lista);
		for(Persona p:nueva) {
			System.out.println(p.getNombre());
		}
			
		listaMasDos(lista);
		for(Persona p:lista) {
			System.out.println(p.getEdad());
		}

		
	
	}

	public static void recorrerListaPersonas(ArrayList<Persona> lista) {
		for (Persona persona : lista) {
			System.out.println(persona.getNombre());
			System.out.println(persona.getEdad());
			persona.andar();
		}

	}

	public static Persona buscaMayor(ArrayList<Persona> lista) {
		// obtener el primer elemento de la lista
		Persona p = lista.get(0);
		for (Persona persona : lista) {
			if (p.getEdad() < persona.getEdad()) {
				p = persona;
			}

		}
		return p;
	}
	public static int sumaEdades(ArrayList<Persona> lista) {
		
		int suma = 0;
		for (Persona persona : lista) {
			suma+= persona.getEdad();

		}
		return suma;
		
		
	}
	
	//voy a ver si me devuelve la gente que este jubilada
	
	public static ArrayList<Persona> listaJubilados(ArrayList<Persona> lista) {
		ArrayList<Persona> jubilados = new ArrayList<Persona>();
		for (Persona persona : lista) {
			
			if ( persona.getEdad()>65) {
				jubilados.add(persona);
			}

		}return jubilados;
		
		
		
	}
	
	//recorrer el array y sumarle 2 años
	
	public static ArrayList<Persona> listaMasDos(ArrayList<Persona> lista) {
		
		for (Persona persona : lista) {
			persona.setEdad(persona.getEdad()+2);
	
		}return lista;
		
		
		
	}
}
