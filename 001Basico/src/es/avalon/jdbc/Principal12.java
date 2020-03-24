package es.avalon.jdbc;

import java.util.ArrayList;

import es.avalon.jdbc3.dto.LibroDTO;

public class Principal12 {
	
	public static void main(String[] args) {
		
		ArrayList<LibroDTO> lista = Libro.buscarTodosConCategoria();
		
		for (LibroDTO libro: lista) {
			
			System.out.println(libro.getIsbn());
			System.out.println(libro.getAutor());
			System.out.println(libro.getCategoriaNombre());
			System.out.println();
		}
		
		
	}

}
