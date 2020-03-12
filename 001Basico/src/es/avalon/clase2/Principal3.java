package es.avalon.clase2;

import es.avalon.clase1.Alumno;

public class Principal3 {

	public static void main(String[] args) {
		
		Alumno Alu= new Alumno();
		
		Alu.nombre="peter";
		Alu.setNota(-3);
		System.out.println(Alu.getNota());

	}

}
