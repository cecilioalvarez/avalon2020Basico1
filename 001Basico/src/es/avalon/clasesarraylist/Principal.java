package es.avalon.clasesarraylist;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		
		ArrayList<String> lista= new ArrayList<String>();
		
		lista.add("hola");
		lista.add("que");
		lista.add("tal");
		lista.add("estas");
		
		
		
		for (int i=0;i<lista.size();i++) {
			
			System.out.println(lista.get(i));
		}
		// elimina la cadena tal de la lista
		lista.remove("tal");
		
		System.out.println("********************");
		
		// vuelvo a pedir a que se recorrar la nueva
		for (int i=0;i<lista.size();i++) {
			
			System.out.println(lista.get(i));
		}
		
		System.out.println(lista.contains("tal"));
		
		lista.set(2,"tal");
		
		for (int i=0;i<lista.size();i++) {
			
			System.out.println(lista.get(i));
		}
	}

}
