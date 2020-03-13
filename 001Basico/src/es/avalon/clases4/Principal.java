package es.avalon.clases4;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Libro l = new Libro("Java");
		System.out.println(l.getTitulo());
		
		Libro l2 = new Libro("Java2");
		System.out.println(l2.getTitulo());
		
		Libro l3 = new Libro("net");
		System.out.println(l3.getTitulo());
		
		System.out.println("Total de libros: " + Libro.getContador());

	}

}
