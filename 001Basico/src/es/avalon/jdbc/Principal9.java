package es.avalon.jdbc;

import java.util.ArrayList;

public class Principal9 {

	public static void main(String[] args) {
		
		ArrayList<Libro> lista= Libro.buscarTodos();
		
		for (Libro libro:lista) {
			System.out.print(libro.getIsbn()+" ");
			System.out.print(libro.getAutor());
			
			System.out.println();
		}

	}

}
