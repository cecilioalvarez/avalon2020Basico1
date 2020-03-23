package es.avalon.jdbc2;

import java.util.ArrayList;

public class Principal7Libro {

	public static void main(String[] args) {

		//Guardo en lista la lista de elementos que me traigo con buscarTodos()
		ArrayList<Libro> lista=Libro.buscarTodos();
		
		for (Libro libro:lista) {
			System.out.print(libro.getIsbn());
			System.out.print(libro.getAutor());
			System.out.println();
		}

	}

}
