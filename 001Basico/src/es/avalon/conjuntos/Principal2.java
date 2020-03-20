package es.avalon.conjuntos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Principal2 {
	
	public static void main(String[] args) {

		Set<String> conjunto= new HashSet<String>();
	
		conjunto.add("hola");
		conjunto.add("adios");
		conjunto.add("casa");
		conjunto.add("hola");
		
		for (String cadena:conjunto) {
		System.out.println(cadena);
		}
		
		System.out.println("--------------------");
		
		// el treeset me lo devuelve por orden alfabetico
		Set<String> otro=new TreeSet<String>(conjunto);
		for (String cadena:otro) {
			System.out.println(cadena);
		}
	
	}
}
