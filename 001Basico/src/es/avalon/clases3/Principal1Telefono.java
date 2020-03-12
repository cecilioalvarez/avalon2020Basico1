package es.avalon.clases3;

import es.avalon.clases2.Telefono;

public class Principal1Telefono {

	public static void main(String[] args) {

		Telefono t=new Telefono();
		
		//privada del telefono
		t.setNumero(636845644);
		
		//no tenemos acceso al numero
		System.out.println(t.getNumero());

	}

}
