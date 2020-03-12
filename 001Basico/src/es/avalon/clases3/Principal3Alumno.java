package es.avalon.clases3;

import es.avalon.clases2.Alumno;

public class Principal3Alumno {

	public static void main(String[] args) {

		//inicializamos los valores a traves de un constructor
		Alumno a1=new Alumno("Pepe",8);
		Alumno a2=new Alumno("Ines",7);
		System.out.println("Nombre -> "+a1.getNombre());
		System.out.println("Nota -> "+a1.getNota());
		System.out.println("Nombre -> "+a2.getNombre());
		System.out.println("Nota -> "+a2.getNota());

	}

}
