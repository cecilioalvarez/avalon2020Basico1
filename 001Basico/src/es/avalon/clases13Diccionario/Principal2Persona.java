package es.avalon.clases13Diccionario;

import java.util.HashMap;

public class Principal2Persona {

	public static void main(String[] args) {


		Persona p1=new Persona("Pedro","Perez",20,"Informatico");
		Persona p2=new Persona("Juan","Gomez",30,"Ingeniero");
		
		HashMap<String,Persona> diccionario=new HashMap<String,Persona>();
		//Meto en el diccionario las personas creadas
		diccionario.put(p1.getNombre(),p1);
		diccionario.put(p2.getNombre(),p2);
		
		//Creo una nueva persona p3 con las mismas caracteristicas que Pedro (p1)
		Persona p3=diccionario.get("Pedro");
		
		//Saco el apellido de pedro
		System.out.println(p3.getApellidos());
		
		//Le doy una palabra y me devuelve el dato completo
		System.out.println(diccionario.get("Juan"));

	}

}
