package es.avalon.clases8Polimorfismo;

import java.util.ArrayList;

public class Principal2 {

	public static void main(String[] args) {

		Deportista d1=new Deportista("Pepe",25,"Futbol");
		Deportista d2=new Deportista("Luis",15,"Surf");
		Deportista d3=new Deportista("Alberto",5,"Petanca");
		Deportista d4=new Deportista("Ines",15,"Padel");
		ArrayList<Deportista> listadepor = new ArrayList<Deportista>();

		listadepor.add(d1);
		listadepor.add(d2);
		listadepor.add(d3);
		listadepor.add(d4);

		for (Deportista d : listadepor) {
			System.out.println(d.getDeporte());
		}
		
		System.out.println("**********************");
		
		//He diseñado una nueva lista
		//Es una lista de personas (los deportistas son personas)
		ArrayList<Persona> lista2 = new ArrayList<Persona>();

		lista2.add(d1);
		lista2.add(d2);
		lista2.add(d3);
		lista2.add(d4);

		//Recorro la lista como si fueran personas accedo al nombre, accedo al nombre
		for (Persona d : lista2) {
			System.out.println(d.getNombre());
		}
	}
	
}