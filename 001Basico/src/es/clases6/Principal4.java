package es.clases6;

import java.util.ArrayList;

public class Principal4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Persona> lista = new ArrayList<>();
		lista.add(new Persona("maria", 26));
		lista.add(new Persona("jesus", 30));
		lista.add(new Persona("maria", 26));
		for (Persona p : lista) {
			System.out.println(p.getNombre() + " tiene " + p.getEdad());
		}
		
		Persona p1= new Persona("pedro", 20);
		Persona p2= new Persona("pedro", 30);
		Persona p3= new Persona("juan", 10);
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
		
		lista.remove(new Persona("maria", 26));//solo borra el primero

		for (Persona p : lista) {
			System.out.println(p.getNombre() + " tiene " + p.getEdad());
		}
		
		System.out.println(lista.contains(new Persona("jesus")));
	}

}
