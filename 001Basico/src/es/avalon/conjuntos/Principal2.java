package es.avalon.conjuntos;

import java.util.HashSet;
import java.util.Set;

public class Principal2 {

	Set<String> conjunto= new HashSet<String>();
	
	conjunto.add("hola");
	conjunto.add("adios");
	
	for (String cadena:conjunto) {
		System.out.println(cadena);
	}
}
