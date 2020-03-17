package es.avalon.clases9.polimorfismo;

import java.util.ArrayList;

public class Principal5 {

	public static void main(String[] args) {
		
		Deportista d1 = new Deportista("pedro", 40, "futbol");
		Deportista d2 = new Deportista("ana", 28, "futbol");
		Deportista d3 = new Deportista("gema", 35, "golf");
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
		
		System.out.println(sumarEdades(lista));
	}
	
	
	//suma de edades
	
	public static int sumarEdades(ArrayList<Persona> lista) {
		int suma = 0;
		for (Persona p: lista) {
			suma = suma + p.getEdad();
		}
		return suma;
		
	}

}
