package es.avalon.Clases3;

import es.avalon.Clases2.Persona;
import es.avalon.Clases2.Telefono;

public class Principal {

	public static void main(String[] args) {

		Telefono t = new Telefono();
		t.setNumero(7000000);

		Persona p = new Persona();
		p.setEdad(200);
		System.out.println(p.getEdad());
		
		
	}

}
