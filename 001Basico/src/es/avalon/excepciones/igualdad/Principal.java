package es.avalon.excepciones.igualdad;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Persona> lista=new ArrayList<>();
		
		lista.add(new Persona("Pedro",20));
		lista.add(new Persona("Pedro",30));
		lista.add(new Persona("Ana",30));
		
		for (Persona p:lista) {
			System.out.println(p.getNombre());
			System.out.println(p.getEdad());
			
		}
//		System.out.println("***********************");
//		Persona p1=new Persona("Pedro",20);
//		Persona p2=new Persona("Pedro",30);
//		System.out.println(p1.equals(p2));
//		System.out.println("***********************");
		
		lista.remove(new Persona("Pedro",20));
		
		for (Persona p:lista) {
			System.out.println(p.getNombre());
			System.out.println(p.getEdad());
		}
		System.out.println("***********************");
		System.out.println(lista.contains(new Persona ("Ana")));
	}

}
