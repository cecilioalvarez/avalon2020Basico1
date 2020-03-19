package es.avalon.igualdad;

import java.util.ArrayList;

public class Principal {
	
	public static void main(String[] args) {
		
		//java 7 (no hace falta repetir el tipo
		ArrayList<Persona> lista = new ArrayList<>();
		
		lista.add(new Persona("pedro", 20));
		lista.add(new Persona("ana", 30));
		
		for (Persona p: lista) {
			System.out.println(p.getNombre());
			System.out.println(p.getEdad());
			
		}
		
		System.out.println("******");
		
		Persona p1 = new Persona("pedro", 20);
		lista.add(p1);
		Persona p2 = new Persona("pedro", 30);
		System.out.println(p1.equals(p2));
		
		System.out.println("******");


		lista.remove(new Persona("pedro", 20));
		
		for (Persona p: lista) {
			System.out.println(p.getNombre());
			System.out.println(p.getEdad());
			
		}
		
		System.out.println("******");
		
		System.out.println(lista.contains(new Persona ("ana", 20)));
		System.out.println(lista.contains(p1));
		
		
		
	}

}
