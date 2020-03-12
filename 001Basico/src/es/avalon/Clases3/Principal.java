package es.avalon.Clases3;

import es.avalon.Clases2.Alumno;
import es.avalon.Clases2.Cuadrado;
import es.avalon.Clases2.Persona;
import es.avalon.Clases2.Telefono;

public class Principal {

	public static void main(String[] args) {

		Telefono t = new Telefono();
		t.setNumero(7000000);

		Persona p = new Persona();
		p.setEdad(200);
		// System.out.println(p.getEdad());

		Alumno alumno = new Alumno("Moises",13);
		System.out.println(alumno.getNombre() + " " + alumno.getNota());

		Alumno alumno1 = new Alumno("Ana", -2);
		System.out.println(alumno1.getNombre() + " " + alumno1.getNota());

		Cuadrado cuadrado = new Cuadrado();
		cuadrado.setLado(6);
		System.out.println("El area del cuadrado es : " + cuadrado.area());
		System.out.println("El perimetro del cuadrado es : " + cuadrado.perimetro());
			

	}

}
