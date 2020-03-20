package Clase9Conjuntos;

import java.util.HashMap;

public class Principal2 {
	public static void main(String[] args) {
		HashMap<String, String> diccionario = new HashMap<>();
		diccionario.put("1", "cecilio");
		diccionario.put("2", "ana");
		diccionario.put("3", "pepe");
		System.out.println(diccionario.get("1"));
		System.out.println(diccionario.get("3"));
	}
}
