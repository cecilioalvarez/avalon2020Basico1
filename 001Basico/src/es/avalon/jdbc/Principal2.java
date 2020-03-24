package es.avalon.jdbc;

import java.util.ArrayList;
import java.util.Scanner;

import es.avalon.jdbcDTO.LibroDTO;

public class Principal2 {

	public static void main(String[] args) {

		ArrayList<LibroDTO> librodto = Libro.mostrarTodoConCategoria();
		
		for (LibroDTO libro : librodto) {
			
			System.out.print(libro.getIsbn() + " ");
			System.out.print(libro.getTitulo() + " ");
			System.out.print(libro.getAutor() + " ");
			System.out.print(libro.getPrecio() + " ");
			System.out.print(libro.getCategoriaNombre() + " ");
			System.out.println(libro.getCategoroaDescripcion() + " ");
			
		}
	}

	private static void mostrarBBDD() {
		ArrayList<Factura> facturas = Factura.mostrarTodo();

		for (Factura i : facturas) {

			System.out.print(i.getNumero() + " ");
			System.out.print(i.getConcepto() + " ");
			System.out.println(i.getImporte());
		}
		System.out.println();
	}

}
