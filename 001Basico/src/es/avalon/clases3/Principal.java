package es.avalon.clases3;

import es.avalon.clases2.Telefono;

public class Principal {
	public static void main(String[] args) {
		
		Telefono t = new Telefono();
		
		//variable privada de telefono
		
		
		t.setNumero(123456789);
		//no tenemos acceso al numero
		System.out.println(t.getNumero());
	}
}
