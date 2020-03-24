package es.avalon.ProblemasHoy;

import java.util.Scanner;

public class Principal7 {

	public static void main(String[] args) {
	
		
		System.out.print("introduce isbn:  ");
		Scanner sc= new Scanner(System.in);
		String isbn=sc.nextLine();
		
		Libro libro= new Libro(isbn);
		libro.borrar();
		
		
		

	}

}