package es.avalon.jdbc2;

import java.util.Scanner;

public class Principal2 {

	public static void main(String[] args) {

		// programa lea los datos y que nos imprima la consulta bien construida

		System.out.print("introduce isbn: ");
		Scanner sc = new Scanner(System.in);
		String isbn = sc.nextLine();
		System.out.print("introduce titulo: ");
		String titulo = sc.nextLine();
		System.out.print("introduce autor: ");
		String autor = sc.nextLine();
		System.out.print("introduce precio: ");
		String precio = sc.nextLine();
		System.out.print("introduce categoria: ");
		String categoria = sc.nextLine();
		System.out.print("introduce categoria: ");

		/*
		System.out.println(isbn);
		System.out.println(titulo);
		System.out.println(autor);
		System.out.println(precio);
		System.out.println(categoria);
		*/
		
		//Imprimo la consulta
		String consulta = "insert into Libros (isbn,titulo,autor,precio,categoria) values";
		consulta = consulta + "('" + isbn + "','" + titulo + "','" + autor + "','" + precio + "','" + categoria + "')";
		System.out.println(consulta);

	}

}
