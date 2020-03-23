package es.avalon.jdbc;

import java.util.Scanner;

public class Principal7FuncionBorrar {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("introduce isbn: ");
		String isbn=sc.nextLine();

		
		Libro libro=new Libro(isbn);

		libro.borrar();

	}

}