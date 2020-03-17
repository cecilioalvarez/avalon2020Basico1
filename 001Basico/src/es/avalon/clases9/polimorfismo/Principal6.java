package es.avalon.clases9.polimorfismo;

import java.util.ArrayList;

public class Principal6 {

	public static void main(String[] args) {
		
		Deportista d1 = new Deportista("pedro", 40, "futbol");
		Deportista d2 = new Deportista("ana", 28, "futbol");
		Deportista d3 = new Deportista("gema", 70, "golf");
		Deportista d4 = new Deportista("sara", 18, "tenis");
		
		ArrayList<Persona> lista = new ArrayList<Persona>();
		
		lista.add(d1);
		lista.add(d2);
		lista.add(d3);
		lista.add(d4);
		
		Persona p1 = new Persona("antonio", 80);
		Persona p2 = new Persona("carla", 30);
		
		lista.add(p1);
		lista.add(p2);
		
		ArrayList<Persona> jubilados = arrJubilados(lista);
		
		for (Persona j: jubilados) {
			System.out.println(j.getNombre());
			System.out.println(j.getEdad());
			
		}
	}
	
	//arraylist personas jubiladas (65 años jubilacion)
	public static ArrayList<Persona> arrJubilados(ArrayList<Persona> lista) {
		ArrayList<Persona> mayor65 = new ArrayList<Persona>();
		
		for (Persona p: lista) {
			
			if(p.getEdad() >= 65) {
				
				mayor65.add(p);
			}
		}
		return mayor65;
	}

}
