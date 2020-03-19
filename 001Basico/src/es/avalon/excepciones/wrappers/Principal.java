package es.avalon.excepciones.wrappers;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		//java 7
		ArrayList<Persona> lista= new ArrayList<>();
		
		Persona p1= new Persona ("pedro",20);
		lista.add(p1); // ab1z
		lista.add(new Persona ("ana",30));
		
		for (Persona p :lista) {
			
			System.out.println(p.getNombre());
			System.out.println(p.getEdad());
		}
		
		System.out.println("***************");
		
		//Persona p1= new Persona("pedro",20);
		Persona p2= new Persona("pedro1",30);
		
		System.out.println(p1.equals(p2));
		
		System.out.println("***************");
		
		
		lista.remove(new Persona ("pedro",20)); // b2az // equals pedro igual al otro pedro
		
		for (Persona p :lista) {
			
			System.out.println(p.getNombre());
			System.out.println(p.getEdad());
		}
		
		System.out.println(lista.contains(p1));
	}

}
