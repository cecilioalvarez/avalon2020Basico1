package es.avalon.clases3;

import es.avalon.clases2.Tableta;

public class Principal5Tableta {

	public static void main(String[] args) {

		Tableta t=new Tableta("apple",100);
		System.out.println(t.getMarca());
		System.out.println(t.getPrecio());
		System.out.println(t.getPrecioIVA());
		System.out.println(t.getPrecioIVA(10));

		//Constructor 1 parametro
		Tableta t2=new Tableta(500);
		System.out.println(t2.getMarca());
	}

}
