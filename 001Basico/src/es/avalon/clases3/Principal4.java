package es.avalon.clases3;

import es.avalon.clases2.Tableta;

public class Principal4 {

	public static void main(String[] args) {
		
		Tableta t= new Tableta("apple",100);
		//no añade el constructor por defecto
		Tableta t1= new Tableta(); //uso el constructor por defecto vacio
		System.out.println(t.getMarca());
		System.out.println(t.getPrecio());
		
		
		System.out.println(t.getPrecioConIVA());
		System.out.println(t.getPrecioConIVA(20));
//		Tableta t2=new Tableta(500);
//		
//		System.out.println(t2.getMarca());

	}

}
