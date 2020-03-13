package es.avalon.Clases4;

public class Principal {

	public static void main(String[] args) {

		Libro libro = new Libro("Java");
		System.out.println(libro.getTitulo());
		Libro libro2 = new Libro("Java2");
		System.out.println(libro2.getTitulo());
		
		System.out.println(Libro.getContador());
	}

}
