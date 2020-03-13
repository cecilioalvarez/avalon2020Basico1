package es.avalon.clases5;

public class PrincipalEjemplar {

	public static void main(String[] args) {
		Ejemplar e1= new Ejemplar(1,2);
		Ejemplar e2= new Ejemplar (1,3);
		System.out.println(Ejemplar.getPesoTotal());

	}

}
