package es.avalon.clases13Conjuntos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Principal {

	public static void main(String[] args) {

		Set<String> conjunto = new HashSet<String>(); // HashSet Saca los elementos del conjunto por orden alfabetico

		conjunto.add("hola");
		conjunto.add("adios");
		conjunto.add("casa");
		conjunto.add("hola");

		for (String cadena : conjunto) {
			System.out.println(cadena);
		}

		System.out.println("******************");

		Set<String> otro = new TreeSet<String>(conjunto);

		for (String cadena : otro) {
			System.out.println(cadena);
		}
	}

}
