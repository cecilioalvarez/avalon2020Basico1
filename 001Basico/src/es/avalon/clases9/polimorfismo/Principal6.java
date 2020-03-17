package es.avalon.clases9.polimorfismo;

import java.util.ArrayList;

public class Principal6 {

	public static void main(String[] args) {

		Deportista d1 = new Deportista("pedro", 20, "tenis");
		Deportista d2 = new Deportista("angel", 70, "futbol");
		Deportista d3 = new Deportista("maria", 70, "tenis");
		Deportista d4 = new Deportista("ana", 15, "padel");

		ArrayList<Persona> lista = new ArrayList<Persona>();

		lista.add(d1);
		lista.add(d2);
		lista.add(d3);
		lista.add(d4);

		Persona p1 = new Persona("antonio", 20);
		Persona p2 = new Persona("carlota", 30);

		lista.add(p1);
		lista.add(p2);

//		recorrerListaPersonas(lista);
//		
//		Persona mayor= buscarMayor(lista);
//		System.out.println(mayor.getNombre());
//		System.out.println(mayor.getEdad());
//		System.out.println(sumarEdades(lista));
		
		//no es una nueva variable
		ArrayList<Persona> nueva= jubilados(lista);
		
		for(Persona p:nueva) {
			
			System.out.println(p.getNombre());
		}

	}
	// en este metodo el que lo construye no necesita
	// saber que existene deportista solo usa el conecpto de persona
	public static void recorrerListaPersonas(ArrayList<Persona> lista) {

		for (Persona persona : lista) {

			System.out.println(persona.getNombre());
			System.out.println(persona.getEdad());
			persona.andar();
		}
	}
	public static Persona buscarMayor(ArrayList<Persona> lista) {

		// obtengo el primer elemento de lista
		Persona p = lista.get(0);
		for (Persona persona : lista) {

			// si la edad del que tengo
			// es menor de la edad con el que compruebo
			// pues asigname el que compruebo
			if (p.getEdad() < persona.getEdad()) {

				p = persona;
			}

		}
		// retornamele
		return p;
	}
	
	public static int sumarEdades(ArrayList<Persona> lista) {

		// obtengo el primer elemento de lista
		int suma=0;
		for (Persona persona : lista) {
			suma=suma+persona.getEdad();
			//suma+=persona.getEdad();

		}
		// retornamele
		return suma;
	}
	
	
	public static ArrayList<Persona> jubilados(ArrayList<Persona> lista) {

		// obtengo el primer elemento de lista
		ArrayList<Persona> jubilados= new ArrayList<Persona>();
		
		
		
		for (Persona persona : lista) {
		
			if(persona.getEdad()>=67) {
				
				jubilados.add(persona);
			}

		}
		// retornamele
		return jubilados;
	}
	
	public static void sumarEdadesDeTodos(ArrayList<Persona> lista) {

		for (Persona persona : lista) {

			persona.setEdad(persona.getEdad()+2);
		}
	}
	
	

}
