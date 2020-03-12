package es.avalon.clases3;

import es.avalon.clases2.Telefono;

public class Principal {

	public static void main(String[] args) {
		

		Telefono t= new Telefono();
		// no tenemos acceso al numero
		t.setNumero=(12312435);
		
		System.out.println(t.getNumero());
		
		
		
	}

}
