package es.avalon.clases3;

import es.avalon.clases2.Telefono;

public class Principal {

	public static void main(String[] args) {

		Telefono t=new Telefono();
		t.numero=636845644;
		//no tenemos acceso al numero
		System.out.println(t.numero);

	}

}
