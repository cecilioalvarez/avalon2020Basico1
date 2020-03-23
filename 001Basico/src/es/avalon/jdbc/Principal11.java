package es.avalon.jdbc;

import java.util.ArrayList;

public class Principal11 {
	
	public static void main(String[] args) {
		
		ArrayList<Libro> lista = Libro.buscarTodos();
		
		for (Libro libro: lista) {
			
			System.out.println(libro.getIsbn());
			System.out.println(libro.getAutor());
			System.out.println();
		}
		
		
	}

}
