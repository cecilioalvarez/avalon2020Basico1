package es.avalon.clases12Excepciones.Igualdad;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {

		//java 7
		ArrayList<Persona> lista=new ArrayList<>();
		//Añado las personas
		lista.add(new Persona ("Pedro",20)); //ab1z
		lista.add(new Persona ("Ana",30));
		
		//Pinto los resultados
		for (Persona p :lista) {
			System.out.println(p.getNombre());
			System.out.println(p.getEdad());
		}
		
		System.out.println("***********************");
		
		Persona p1=new Persona("Pedro",20);
		Persona p2=new Persona("Pedro",30);
		System.out.println(p1.equals(p2)); //Me compara si son iguales o no true/false
		
		System.out.println("***********************");
		
		//Quiero eliminar una persona
		lista.remove(new Persona ("Pedro",20)); //b2az //equals pedro igual al otro pedro
		
		//Pinto los resultados
		for (Persona p :lista) {
			System.out.println(p.getNombre());
			System.out.println(p.getEdad());
		}
		System.out.println(lista.contains(new Persona ("Ana"))); //Pregunta si la lista contiene a Ana //me da true
	}

}
