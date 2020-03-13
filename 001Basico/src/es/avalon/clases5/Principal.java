package es.avalon.clases5;

public class Principal {

	public static void main(String[] args) {
	Libro l=new Libro("java");
	System.out.println(l.getTitulo());
	
	Libro l2=new Libro ("java");
	System.out.println(l2.getTitulo());
	
	Libro l3= new Libro("net");
	System.out.println(Libro.getContador());

	}

}
