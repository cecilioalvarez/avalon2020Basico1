package es.avalon.dicionario;

import java.util.HashMap;

public class Principal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona p1=new Persona("Pedro","Perez",20,"informatico");
		Persona p2=new Persona("Juan","Gomez",30,"ingeniero");
		
		HashMap<String,Persona> diccionario=new HashMap<String,Persona>();
		
		diccionario.put(p1.getNombre(), p1);
		diccionario.put(p2.getNombre(), p2);
		
		Persona p3=diccionario.get("Pedro");
		System.out.println(p3.getApellidos());
		System.out.println(diccionario.get("Juan"));
	}

}
