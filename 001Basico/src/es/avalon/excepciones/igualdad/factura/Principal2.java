package es.avalon.excepciones.igualdad.factura;

import java.util.HashSet;
import java.util.Set;

public class Principal2 {

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
