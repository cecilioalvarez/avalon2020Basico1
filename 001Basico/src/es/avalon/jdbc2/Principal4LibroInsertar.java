package es.avalon.jdbc2;

import java.util.Scanner;

public class Principal4LibroInsertar {

	public static void main(String[] args) {

		System.out.print("introduce isbn: ");
		Scanner sc = new Scanner(System.in);
		String isbn = sc.nextLine();
		System.out.print("introduce titulo: ");
		String titulo = sc.nextLine();
		System.out.print("introduce autor: ");
		String autor = sc.nextLine();
		System.out.print("introduce precio: ");
		int precio = Integer.parseInt(sc.nextLine());
		System.out.print("introduce categoria: ");
		String categoria = sc.nextLine();
		System.out.print("introduce categoria: ");
		
		Libro libro=new Libro (isbn,titulo,autor,precio,categoria);
		libro.insertar();

	}

}
