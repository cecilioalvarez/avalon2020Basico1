package es.avalon.diccionarios;

import java.util.HashMap;

public class Principal3 {

	public static void main(String[] args) {
		
		
		Persona p1= new Persona("pedro","perez",20,"informatico");
		Persona p2= new Persona ("juan","gomez",30,"ingeniero");
		
		HashMap<String,Persona> diccionario= new HashMap<String,Persona>();
		
		diccionario.put(p1.getNombre(), p1);
		diccionario.put(p2.getNombre(), p2);
		
		Persona p3= diccionario.get("pedro");
		
		
		
		System.out.println(diccionario.get("juan"));
		

	}

}
