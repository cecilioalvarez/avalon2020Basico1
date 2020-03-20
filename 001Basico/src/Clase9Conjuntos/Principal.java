package Clase9Conjuntos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Principal {

	public static void main(String[] args) {
		Set<String> conjunto= new HashSet<>();
	
		conjunto.add("hola");
		conjunto.add("adios");
		conjunto.add("hola");
		
		for(String cadena:conjunto) {
			System.out.println(cadena);
		}
		//Ahora quiero usarlo alfabeticamente por eso uso el TreeSet
		Set<String> conjunto2= new TreeSet<>();
			
			conjunto2.add("hola");
			conjunto2.add("adios");
			conjunto2.add("hola");
			
			for(String cadena2:conjunto2) {
				System.out.println(cadena2);			
		}
	}
}