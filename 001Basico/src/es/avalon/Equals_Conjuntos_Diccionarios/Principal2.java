package es.avalon.Equals_Conjuntos_Diccionarios;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Principal2 {

	public static void main(String[] args) {

		Set<String> conjunto = new HashSet<String>();
		conjunto.add("a");
		conjunto.add("c");
		conjunto.add("b");
		conjunto.add("b");
		
		Set<String> conjuntoTree = new TreeSet<String>();
		conjuntoTree.add("a");
		conjuntoTree.add("c");
		conjuntoTree.add("b");
		conjuntoTree.add("b");


		for (String cadena : conjunto) {
			System.out.println(cadena);
		}
		System.out.println("***************");
		for (String cadena : conjuntoTree) {
			System.out.println(cadena);
		}

	}

}
