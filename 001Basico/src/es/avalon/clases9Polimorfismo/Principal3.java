package es.avalon.clases9Polimorfismo;

import java.util.ArrayList;

public class Principal3 {

	public static void main(String[] args) {

		Deportista d1 = new Deportista("pedro", 20, "tenis");

		Deportista d2 = new Deportista("ana", 25, "futbol");

		Deportista d3 = new Deportista("victor", 45, "tenis");

		Deportista d4 = new Deportista("paco", 20, "baloncesto");

		ArrayList<Persona> lista = new ArrayList<Persona>();

		lista.add(d1);
		lista.add(d2);
		lista.add(d3);
		lista.add(d4);

		Persona p1= new Persona("antonio",20);
		Persona p2= new Persona("carlota",35);
		lista.add(p1);
		lista.add(p2);
		
			recorrerListaPersonas(lista);
			Persona mayor=buscarMayor(lista);
			System.out.println(mayor.getNombre());
			System.out.println(mayor.getEdad());
			
			
		
	}
		public static void recorrerListaPersonas(ArrayList<Persona> lista) {
			for(Persona persona:lista) {
				System.out.println(persona.getNombre());
				System.out.println(persona.getEdad());
				persona.andar();
				
				
				
			}
		}
		
		public static Persona buscarMayor(ArrayList<Persona>lista) {
			Persona p=lista.get(0);
			for(Persona persona : lista) {
				if(p.getEdad()<persona.getEdad()) {
					p=persona;
					
				}
			}
			return p;
			
		}
	}

	


