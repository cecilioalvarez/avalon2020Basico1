package es.avalon.jdbc;

import java.util.Scanner;

public class Principal6FuncionInsert {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("introduce isbn: ");
		String isbn=sc.nextLine();
		System.out.print("introduce titulo: ");
		String titulo=sc.nextLine();
		System.out.print("introduce autor: ");
		String autor=sc.nextLine();
		System.out.print("introduce precio: ");
		int precio=Integer.parseInt(sc.nextLine());
		System.out.print("introduce categoria: ");
		String categoria=sc.nextLine();
		
		Libro libro=new Libro(isbn,titulo,autor,precio,categoria);
		libro.insertar();
		
//		
//		System.out.println(isbn);
//		System.out.println(titulo);
//		System.out.println(autor);
//		System.out.println(precio);
//		System.out.println(categoria);


	
	}

}