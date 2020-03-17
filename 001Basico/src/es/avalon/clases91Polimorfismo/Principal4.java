package es.avalon.clases91Polimorfismo;

import java.util.ArrayList;

public class Principal4 {

	public static void main(String[] args) {
		
		Deportista d1= new Deportista("pedro",20,"tenis");
		Deportista d2= new Deportista("angel",30,"futbol");
		Deportista d3= new Deportista("maria",50,"tenis");
		Deportista d4= new Deportista("ana",15,"padel");
		
		ArrayList<Deportista> lista= new ArrayList<Deportista>();
		
		lista.add(d1);
		lista.add(d2);
		lista.add(d3);
		lista.add(d4);
		
		for (Deportista undeportista:lista) {
			
			System.out.println(undeportista.getDeporte());
		}
		
		//he diseñado una nueva lista
		//esa lista es de Personas los deportis son un tipo de persona
		
		ArrayList<Persona> lista2= new ArrayList<Persona>();
		
		//añadir los deportistas a la lista
		lista2.add(d1);
		lista2.add(d2);
		lista2.add(d3);
		lista2.add(d4);
		
		//recorro la lista como si fueran personas 
		// accedo al nombre
		for (Persona undeportista:lista2) {
			
			System.out.println(undeportista.getNombre());
		}
		

	}

}
