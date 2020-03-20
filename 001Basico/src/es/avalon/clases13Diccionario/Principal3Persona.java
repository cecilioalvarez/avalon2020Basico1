package es.avalon.clases13Diccionario;

import java.util.HashMap;
import java.util.Set;

public class Principal3Persona {

	public static void main(String[] args) {


		Persona p1=new Persona("Pedro","Perez",20,"Informatico");
		Persona p2=new Persona("Juan","Gomez",30,"Ingeniero");
		
		HashMap<String,Persona> diccionario=new HashMap<String,Persona>();
		diccionario.put(p1.getNombre(),p1);
		diccionario.put(p2.getNombre(),p2);

		//Devuelveme el conjunto de claves del diccionario
		Set<String> claves =diccionario.keySet(); //keySet es un metodo que te 
		System.out.println(claves); 
		for (String clave :claves) {
			System.out.println(diccionario.get(clave));
		}
		
		

	}

}
