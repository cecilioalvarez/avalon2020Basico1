package es.avalon.clasesarraylist;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {


		ArrayList<String> lista=new ArrayList<String>();
		
		lista.add("hola");
		lista.add("que");
		lista.add("tal");
		lista.add("estas");

		for (int i=0;i<lista.size();i++) {
			System.out.println(lista.get(i));
		}
		
		System.out.println("*************************");
		//Elimino la cadena "tal" de la lista
		lista.remove("tal");
		
		//Vuelvo a pedir que la recorra
		for (int i=0;i<lista.size();i++) {
			System.out.println(lista.get(i));
		}
		System.out.println(lista.contains("tal"));
		
	}

}
