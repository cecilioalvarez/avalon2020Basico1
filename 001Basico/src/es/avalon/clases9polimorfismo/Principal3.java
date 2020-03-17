package es.avalon.clases9polimorfismo;

import java.util.ArrayList;

public class Principal3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Deportista d1=new Deportista(22,"Sara","Natacion");
		Deportista d2=new Deportista(70,"Juan","Padel");
		Deportista d3=new Deportista(72,"Mario","Tenis");
		Deportista d4=new Deportista(26,"Maria","Futbol");
		
		ArrayList<Persona> lista=new ArrayList<Persona>();
		
		lista.add(d1);
		lista.add(d2);
		lista.add(d3);
		lista.add(d4);
		
		Persona p1=new Persona(20,"Antonio");
		Persona p2=new Persona(26,"Santi");
		
		lista.add(p1);
		lista.add(p2);
		
		recorrerListaPersonas(lista);
		
		Persona mayor=personamayor(lista);
		System.out.println("la persona de mayor edad es "+mayor.getNombre());
		
		// pintamos la suma de las edades
		System.out.println("la suma de las edades es "+sumaedades(lista));
		
		// Pintamos el array de jubilados
		// definimos una variable "nueva" en la que guardamos nuestro array creado en el metodo jubilados
		ArrayList<Persona> nueva=jubilados(lista);
		
		for (Persona p:nueva) {
			System.out.println(p.getNombre());
		}
		
		// devuelve todas las personas con dos años mas
		sumamos2años(lista);
	
				
	}
	// en este metodo el que lo construye no necesita saber que existen deportistas
	// solo usa el concepto de persona
	public static void recorrerListaPersonas(ArrayList<Persona> lista) {
		
		for (Persona persona:lista) {
			
			System.out.println(persona.getNombre());
			System.out.println(persona.getEdad());
			persona.andar();
		}
		
	}
	public static Persona personamayor(ArrayList<Persona> lista) {
		
		// obtengo el primer elemento de la lsita
		Persona p=lista.get(0);
		
		for (Persona persona:lista) {
			
			// si la edad del qeu tengo es menor que la edad con el que compruebo
			// asigname el que compruebo
			if (p.getEdad()<persona.getEdad()) {
			
				p=persona;
			}
		}
		// retornarle
		return p;
	}

	public static int sumaedades(ArrayList<Persona> lista) {
		
		int suma=0;
		
		for (Persona persona:lista) {
			
			suma=suma+persona.getEdad();
		}
		return suma;
	}
	
	public static ArrayList<Persona> jubilados(ArrayList<Persona> lista){
		
		ArrayList<Persona> jubilados=new ArrayList<Persona>();
		
		for (Persona persona:lista) {
			
			if(persona.getEdad()>65) {
				jubilados.add(persona);
			}
		}
		return jubilados;
	}
	
	public static void sumamos2años(ArrayList<Persona> lista) {
		
		for (Persona persona:lista) {
			
			System.out.println(persona.getNombre());
			System.out.println(persona.getEdad()+2);
		}
		
	}
}
