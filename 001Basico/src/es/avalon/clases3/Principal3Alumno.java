package es.avalon.clases3;

import es.avalon.clases2.Alumno;

public class Principal3Alumno {

	public static void main(String[] args) {

		Alumno a=new Alumno();
		a.setNota(17);
		a.setNombre("Pepe");
		System.out.println("Nombre -> "+a.getNombre());
		System.out.println("Nota -> "+a.getNota());

	}

}
