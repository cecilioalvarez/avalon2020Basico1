package es.avalon.Clases3;

import es.avalon.Clases2.Tableta;

public class Principal2 {

	public static void main(String[] args) {

		Tableta tableta = new Tableta("Apple", 100);
		System.out.println(tableta.getMarca());
		System.out.println(tableta.getPrecio());
		System.out.println(tableta.getPrecioConIVA(10));

		Tableta tabletaApple = new Tableta(150);
		System.out.println(tabletaApple.getPrecio() + "  " + tableta.getMarca());
	}

}