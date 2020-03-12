package es.avalon.clases4;

import es.avalon.clases3.Tablet;

public class PrincipalTableta {

	public static void main(String[] args) {
		Tablet t= new Tablet("apple",100);
		System.out.println(t.getMarca());
		System.out.println(t.getPrecio());
		System.out.println(t.getPrecioConIva(10));
		System.out.println(t.getPrecioConIva());
		
		Tablet t2=new Tablet(500);
		System.out.println(t2.getMarca());

	}

}
