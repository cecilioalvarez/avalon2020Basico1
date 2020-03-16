package es.clases3;

import java.util.ArrayList;

public class Principal2 {

	public static void main(String[] args) {
		
		ArrayList<String> lista= new ArrayList<String>();
		lista.add("hola!");
		lista.add("esta semana");
		lista.add("haras la ola");
		lista.add("(8)");
		for (int i=0; i<lista.size();i++) {
			System.out.println(lista.get(i));
		}
		lista.remove("(8)");
		for (int i=0; i<lista.size();i++) {
			System.out.println(lista.get(i));
		}
		System.out.println(lista.contains("(8)"));
		
		lista.set(2,"(8)");
		
		for (int i=0; i<lista.size();i++) {
			System.out.println(lista.get(i));
		}
		
	}

}
