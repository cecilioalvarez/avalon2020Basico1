package es.avalon.clases3;

import es.avalon.clases2.Alumno;

public class Principal3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Alumno a = new Alumno();
//		
//		a.setNombre("Razvan");
//		a.setNota(15);
		
		Alumno a = new Alumno("pepe", 7);
		
		System.out.println(a.getNombre());
		System.out.println(a.getNota());

	}

}
