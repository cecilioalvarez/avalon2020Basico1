package es.avalon.wrappers;

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

		lista.remove(new Persona("pedro", 20));
		
		for (Persona p: lista) {
			System.out.println(p.getNombre());
			System.out.println(p.getEdad());
			
		}
		
		
		
	}

}
