package es.avalon.clases3;

import es.avalon.clases2.Tableta;

public class Principal5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Primer producto");
		
//		Tableta t = new Tableta();

		
		Tableta t = new Tableta("samsung", 100);
		System.out.println(t.getMarca());
		System.out.println(t.getPrecio());
		System.out.println(t.getPrecioConIVA());
		System.out.println(t.getPrecioConIVA(20));
		
		System.out.println("Segundo producto");
		
		Tableta t2 = new Tableta(500);
		System.out.println(t2.getMarca());
		System.out.println(t2.getPrecio());
		System.out.println(t2.getPrecioConIVA());
		System.out.println(t2.getPrecioConIVA(20));
	}
}
