package es.avalon.diccionarios;

import java.util.HashMap;

public class Principal {

	public static void main(String[] args) {
		
		
		HashMap<String,String> diccionario=
				new HashMap<String,String>();
		diccionario.put("1", "cecilio");
		diccionario.put("2", "ana");
		diccionario.put("3", "pedro");
		diccionario.put("4", "angel");
		diccionario.put("5", "maria");
		
		System.out.println(diccionario.get("1"));
		System.out.println(diccionario.get("4"));
		
		
		
		

	}

}
