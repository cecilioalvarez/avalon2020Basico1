package es.avalon.conjuntos;

import java.util.HashSet;
import java.util.Set;

public class EjemploPrincipal {

	public static void main(String[] args) {
		
		Set<String> conjunto= new HashSet<String>();
		
		conjunto.add("hola");
		conjunto.add("adios");
		conjunto.add("hola");
		
		for (String cadena:conjunto) {
			
			System.out.println(cadena);
		}

	}

}
