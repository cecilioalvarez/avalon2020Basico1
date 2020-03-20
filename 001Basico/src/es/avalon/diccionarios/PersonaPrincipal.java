package es.avalon.diccionarios;

import java.util.HashMap;
import java.util.Set;

public class PersonaPrincipal {

	public static void main(String[] args) {
		Persona p1= new Persona("pedro", "perez",20);
		Persona p2= new Persona("antonio", "gomez",40);
		HashMap<String,Persona> diccionario= new HashMap<String, Persona>();
		
		diccionario.put(p1.getNombre(), p1);
		diccionario.put(p2.getNombre(), p2);
		
		Set<String> claves=diccionario.keySet();
		
		for (String clave:claves) {
			System.out.println(diccionario.get(clave));
		}
		
	}

}
