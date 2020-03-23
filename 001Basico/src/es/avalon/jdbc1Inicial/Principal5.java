package es.avalon.jdbc1Inicial;

import java.util.Scanner;

public class Principal5 {

	public static void main(String[] args) {

		System.out.print("introduce isbn: ");
		Scanner sc= new Scanner(System.in);
		String isbn=sc.nextLine();
		System.out.print("introduce titulo: ");
		String titulo=sc.nextLine();
		
		System.out.println(isbn);
		System.out.println(titulo);

	}

}
