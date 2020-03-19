package es.avalon.igualdad;

import java.util.HashSet;
import java.util.Set;

public class Principal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> conjunto = new HashSet<String>();
		
		conjunto.add("Hola");
		conjunto.add("Adios");
		conjunto.add("Hola");
		
		for (String cadena: conjunto) {
			System.out.println(cadena);
		}
		

	}

}
