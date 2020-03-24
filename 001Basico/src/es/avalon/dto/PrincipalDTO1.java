package es.avalon.dto;

import java.util.ArrayList;

public class PrincipalDTO1 {

	public static void main(String[] args) {
		
		ArrayList<LibroDTO> lista= Libro.buscarTodosConCategoria();
		
		for (LibroDTO librodto:lista) {
			System.out.print(librodto.getIsbn()+" ");
			System.out.print(librodto.getAutor());
			
			System.out.println();
		}

	}

}
