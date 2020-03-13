package es.avalon.clases4;

public class Principal1libro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		libro l=new libro("java");
		System.out.println(l.gettitulo());
		
		libro l2=new libro("java2");
		System.out.println(l2.gettitulo());
		
		// para contar los libros que hemos creado, colocamos un contador en el costructor
		
		libro l3=new libro("java3");
		System.out.println(l3.gettitulo());
		System.out.println(libro.getcontador());
	}

}
