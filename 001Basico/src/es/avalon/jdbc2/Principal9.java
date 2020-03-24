package es.avalon.jdbc2;

import java.util.ArrayList;

import es.avalon.jdbc.dto.LibroDTO;

public class Principal9 {

	public static void main(String[] args) {

	ArrayList<LibroDTO> lista=Libro.buscarTodosConCategoria();
	
	for (LibroDTO libro:lista) {
		System.out.print(libro.getIsbn());
		System.out.print(libro.getAutor());
		System.out.print(libro.getCategoriaNombre());
		System.out.println();
	}

	}

}
