package es.avalon.clasesarraylist;

import java.util.ArrayList;

public class Principal3 {

	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		lista.add(8);
		lista.add(2);
		lista.add(5);
		lista.add(7);
		
		for (Integer i: lista) {
			System.out.println(i);
		}

	}

}
