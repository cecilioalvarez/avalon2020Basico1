package es.avalon.excepciones.wrappers;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		ArrayList<Persona> lista= new ArrayList<>();
		
		lista.add(new Persona ("pedro",20));
		lista.add(new Persona ("ana",30));
		
		for (Persona p:lista){
			System.out.println(p.getNombre());
			System.out.println(p.getEdad());
		}
		
		lista.remove(new Persona ("pedro",20));
		
		for (Persona p:lista) {
			System.out.println(p.getNombre());
			System.out.println(p.getEdad());
		}

	}

}
