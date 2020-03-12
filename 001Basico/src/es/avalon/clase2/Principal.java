package es.avalon.clase2;

import es.avalon.clase1.Telefono;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Telefono t=new Telefono();
		t.numero=12345;
		//no tenemos acceso al numero
		System.out.println(t.numero);
	}

}
