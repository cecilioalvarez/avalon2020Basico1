package es.avalon.ClasesArrayList;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {

		ArrayList<String> lista = new ArrayList<String>();

		lista.add("Hola");
		lista.add("que");
		lista.add("tal");
		lista.add("estas");

		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		lista.remove("tal");
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		System.out.println(lista.contains("Hola"));
		
	}
}
