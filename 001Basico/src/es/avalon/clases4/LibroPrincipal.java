package es.avalon.clases4;

public class LibroPrincipal {

	public static void main(String[] args) {
		
		
		Libro l= new Libro("java");
		System.out.println(l.getTitulo());
		
		Libro l2= new Libro("java2");
		
		Libro l3= new Libro("net");
		System.out.println(l2.getTitulo());
		// a que se trata de una variable a nivel de clase
		System.out.println(Libro.getContador());
		
	}

}
