package es.avalon.clases3;

import es.avalon.clases2.Alumno;
import es.avalon.clases2.Persona;

public class Principal3 {

	public static void main(String[] args) {
		
		
		Alumno a= new Alumno();
		a.setNota(12);
		System.out.println(a.getNota());
		Alumno a1= new Alumno();
		a1.setNota(-3);
		System.out.println(a1.getNota());

	}

}
