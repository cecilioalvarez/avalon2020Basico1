package es.avalon.clases9polimorfismo;

import java.util.ArrayList;

public class Principal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Deportista d1=new Deportista(22,"Sara","Natacion");
		Deportista d2=new Deportista(23,"Juan","Padel");
		Deportista d3=new Deportista(28,"Mario","Tenis");
		Deportista d4=new Deportista(26,"Maria","Futbol");
		
		
		ArrayList<Deportista> lista=new ArrayList<Deportista>();
		
		lista.add(d1);
		lista.add(d2);
		lista.add(d3);
		lista.add(d4);
		
		for (Deportista d:lista) {
			System.out.println(d.getDeporte());
		}
		
		// he diseñado una nueva lista de personas
		// los deportistas son un tipo de persona
		
		ArrayList<Persona> lista2=new ArrayList<Persona>();
		
		// añado los deportistas a la lista
		lista2.add(d1);
		lista2.add(d2);
		lista2.add(d3);
		lista2.add(d4);
		
		// recorro la lista como si fueran personas
		// accedo al nombre
		for (Persona d:lista) {
			System.out.println(d.getNombre());
		}
		
	}


}
