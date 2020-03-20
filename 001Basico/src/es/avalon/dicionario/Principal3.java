package es.avalon.dicionario;

import java.util.HashMap;
import java.util.Set;

public class Principal3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona p1=new Persona("Pedro","Perez",20,"informatico");
		Persona p2=new Persona("Juan","Gomez",30,"ingeniero");
			
		HashMap<String,Persona> diccionario=new HashMap<String,Persona>();
		
		diccionario.put(p1.getNombre(), p1);
		diccionario.put(p2.getNombre(), p2);
		
		// devuelveme el conjunto de claves del diccionario
		Set<String> claves=diccionario.keySet();
		
		for (String clave:claves) {
			System.out.println(diccionario.get(clave));
		}
	}

}
