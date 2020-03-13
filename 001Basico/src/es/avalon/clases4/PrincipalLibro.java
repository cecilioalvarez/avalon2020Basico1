package es.avalon.clases4;

public class PrincipalLibro {

	public static void main(String[] args) {


		Libro l=new Libro("java");
		System.out.println(l.getTitulo());
		
		Libro l2=new Libro("java2");
		System.out.println(l2.getTitulo());
		Libro l3=new Libro("net");
		System.out.println(l3.getTitulo());
		System.out.println(Libro.getContador());
		

	}

}
