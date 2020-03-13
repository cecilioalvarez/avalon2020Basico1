package es.avalon.clases3;

import es.avalon.clases2.Alumno;
import es.avalon.clases2.Persona;

public class Principal3 {

	public static void main(String[] args) {
		
		// inializamos los valores a traves de un constructor
		Alumno a= new Alumno("pepe",7);
		
		System.out.println(a.getNota());
		Alumno a1 = new Alumno("ana",5);
	
		System.out.println(a1.getNota());

	}

}
