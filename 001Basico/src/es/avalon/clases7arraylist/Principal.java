package es.avalon.clases7arraylist;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<String>();
		
		lista.add("hola");
		lista.add("que");
		lista.add("tal");
		lista.add("estas");
		
		for (int i=0; i<lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		System.out.println("*******************");
		// eliminar la cadena "tal" de la lista
		lista.remove("tal");
		// se recorre la nueva 
		for (int i=0; i<lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		System.out.println("*******************");
		System.out.println(lista.contains("tal"));
		

	}

}
