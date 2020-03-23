package es.avalon.jdbc2;

import java.util.Scanner;

import es.avalon.jdbc2.Libro;

public class Principal5LibroBorrar {

	public static void main(String[] args) {


		System.out.print("introduce isbn: ");
		Scanner sc = new Scanner(System.in);
		String isbn = sc.nextLine();
				
		Libro libro=new Libro (isbn);
		libro.borrar();

	}

}
