package es.clases7;

import java.util.HashMap;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Persona p1= new Persona ("pedro", "perez", 20, "informatico");
Persona p2= new Persona ("juan", "gomeez", 30, "ingeniero");
	HashMap<String,Persona> diccionario=new HashMap<String,Persona>();
	
	diccionario.put(p1.getNombre(),p1);
	diccionario.put(p2.getNombre(),p2);
//	Persona p3=diccionario.get("pedro");
//	System.out.println(p3.getApellidos()+ " "+p3.getEdad());
	
	//System.out.println(diccionario.get("juan"));
	
	//para recorrer el diccionario
	
	Set<String> claves= diccionario.keySet();
	for (String clave:claves){
		System.out.println(diccionario.get(clave));//por el toString en la clase persona
	}
	}

}
