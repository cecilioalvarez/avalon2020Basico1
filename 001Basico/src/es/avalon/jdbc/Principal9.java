package es.avalon.jdbc;

import java.util.Scanner;

public class Principal9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce ISBN:");
		Scanner sc = new Scanner(System.in);
		String isbn = sc.nextLine();
		
		
		
		Libro libro = new Libro(isbn);

		libro.eliminar();
		System.out.println("Libro eliminado");

	}

}
