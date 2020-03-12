package es.avalon.clases3;

import es.avalon.clases2.Cuadrado;

public class Principal4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuadrado c1 = new Cuadrado();
		
		c1.setLado(3);
		
		System.out.println("El cuadrado tiene un lado de dimension " + c1.getLado()+ ".") ;
		System.out.println("El cuadrado tiene un perimetro de dimension " + c1.perimetro()+ ".");
		System.out.println("El cuadrado tiene un area de dimension " +c1.area()+ ".");
		

	}

}
