package es.clases6;

import java.util.*;
public class Prinicpal6 {

	public static void main(String[] args) {
		
		HashMap<String, String> diccionario=new HashMap<String,String>();
		diccionario.put("1","ceci");
		diccionario.put("2","juan");
		diccionario.put("3","ines");
		diccionario.put("4","angel");
		diccionario.put("5","maria");
		
		System.out.println(diccionario.get("1"));
		System.out.println(diccionario.get("4"));
	}

}
