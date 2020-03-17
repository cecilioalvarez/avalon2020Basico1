package es.avalon.clases9.polimorfismo;

import java.util.ArrayList;

public class Principal3 {

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
		
		Persona p1 = new Persona("antonio", 20);
		Persona p2 = new Persona("carla", 30);
		
		lista.add(p1);
		lista.add(p2);
		
		recorrerListaPersona(lista);
	}
	
	public static void recorrerListaPersona(ArrayList<Persona> lista) {
		for (Persona p: lista) {
			System.out.println(p.getNombre());
			System.out.println(p.getEdad());
			p.andar();
		}
	}
	

}
