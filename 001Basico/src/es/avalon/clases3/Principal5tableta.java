package es.avalon.clases3;

import es.avalon.clases2.tableta;

public class Principal5tableta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		tableta t=new tableta("apple",100);
		System.out.println(t.getmarca());
		System.out.println(t.getprecio());
		System.out.println(t.getprecioIVA());
		System.out.println(t.getprecioIVA(10));
		
		// si no le indicas marca, te pone apple por defecto
		tableta t2=new tableta(500);
		System.out.println(t2.getmarca());
	}

}
