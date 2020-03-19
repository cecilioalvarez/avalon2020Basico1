package es.avalon.diccionarios;

import java.util.HashMap;

public class EjemploPrincipal {

	public static void main(String[] args) {
		HashMap<String, String> diccionario= new HashMap<String,String>();
		
		diccionario.put("1","mario");
		diccionario.put("2","pablo");
		diccionario.put("3","gema");
		diccionario.put("4","paula");
		diccionario.put("5","pedro");
		
		System.out.println(diccionario.get("1"));
		System.out.println(diccionario.get("3"));

	}

}
