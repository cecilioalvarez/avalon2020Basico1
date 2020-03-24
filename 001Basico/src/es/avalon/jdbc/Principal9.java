package es.avalon.jdbc;

import java.util.ArrayList;

import es.avalon.jdbc.dto.LibroDTO;

public class Principal9 {

	public static void main(String[] args) {
		
		// esto guardando aqui la lista de elemetnos totales
		ArrayList<LibroDTO> lista= Libro.buscarTodosConCategoria();
		
		for (LibroDTO libro:lista) {
			
			System.out.print(libro.getIsbn());
			System.out.print(libro.getAutor());
			System.out.print(libro.getCategoriaNombre());
			System.out.println();
		}

	}

}
