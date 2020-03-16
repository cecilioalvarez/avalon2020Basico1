package es.avalon.clasesarraylist;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> lista=new ArrayList<String>();
		
		lista.add("hola");
		lista.add("que");
		lista.add("tal");
		lista.add("estas");
		
		
		for (int i=0; i<lista.size();i++) {
			
			System.out.println(lista.get(i));
		}
		
		lista.remove("tal");
		
		for (int i=0; i<lista.size();i++) {
			
			System.out.println(lista.get(i));
		}
		
		System.out.println(lista.contains("hola"));
		System.out.println(lista.contains("tall"));
	
	}

}
