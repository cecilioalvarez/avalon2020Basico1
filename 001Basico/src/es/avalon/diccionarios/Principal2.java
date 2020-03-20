package es.avalon.diccionarios;

import java.util.HashMap;
import java.util.Set;

public class Principal2 {

	public static void main(String[] args) {
		
		
		Persona p1= new Persona("pedro","perez",20,"informatico");
		Persona p2= new Persona ("juan","gomez",30,"ingeniero");
		
		HashMap<String,Persona> diccionario= new HashMap<String,Persona>();
		
		diccionario.put(p1.getNombre(),p1);
		diccionario.put(p2.getNombre(),p2);
		
		// devuelve el conjunto de claves del diccionario
		Set<String> claves=diccionario.keySet();
		
		//System.out.println(claves);
		for (String clave:claves) {
			
			System.out.println(diccionario.get(clave));
			
		}
		
	
	}

}
