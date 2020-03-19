package es.avalon.Equals_Conjuntos_Diccionarios;

import java.util.HashMap;

public class Principal3 {

	public static void main(String[] args) {

		HashMap<String,String> diccionario = new HashMap<String,String>();
		
		diccionario.put("1", "cecilio");
		diccionario.put("2", "ana");
		diccionario.put("3", "pedro");
		diccionario.put("4", "lucia");
		diccionario.put("5", "nerea");
		diccionario.put("6", "maria");
		
		System.out.println(diccionario.get("1"));
	}

}
