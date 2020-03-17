package es.avalon.clases9.polimorfismo;

import java.util.ArrayList;

public class Principal2 {

	public static void main(String[] args) {
		
		Deportista d1 = new Deportista("pedro", 40, "futbol");
		Deportista d2 = new Deportista("ana", 28, "futbol");
		Deportista d3 = new Deportista("gema", 35, "golf");
		Deportista d4 = new Deportista("sara", 18, "tenis");
		Deportista d5 = new Deportista("jesus", 24, "ajedrez");
		
		ArrayList<Deportista> deportistas = new ArrayList<Deportista>();
		
		deportistas.add(d1);
		deportistas.add(d2);
		deportistas.add(d3);
		deportistas.add(d4);
		deportistas.add(d5);
		
		for (Deportista d: deportistas) {
			System.out.println(d.getNombre());
			System.out.println(d.getDeporte());
		}	
		
		System.out.println("***********");
		
		//Nueva lista de personas
		ArrayList<Persona> personas = new ArrayList<Persona>();
		
		personas.add(d1);
		personas.add(d2);
		personas.add(d3);
		personas.add(d4);
		personas.add(d5);
		
		for (Persona p: personas) {
			System.out.println(p.getNombre());
			//No puede acceder a getDeporte()
			//System.out.println(p.getDeporte());
		}	
		
		

	}

}
