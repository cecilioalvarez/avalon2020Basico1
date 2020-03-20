package Clase9Conjuntos;

import java.util.HashMap;
import java.util.Set;

public class Principal3 {

	public static void main(String[] args) {
		Persona p1=new Persona("Pedro",20);
		Persona p2=new Persona("Pedro",20);
	    HashMap<String,Persona> diccionario=new HashMap<String,Persona>();
	
	diccionario.put(p1.getNombre(),p1);
	diccionario.put(p2.getNombre(),p2);
	
	
	Set<String> claves=diccionario.keySet();
	System.out.println(claves);
	//keyset devuelve el conjunto de claves en el diccionario la clave es el 
	//primer elemento que pones en el diccionario
	//y el valor lo que pones en el segundo
	for(String clave:claves) {
		
		System.out.println(diccionario.get(clave));
	}
	}

}
