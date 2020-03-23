package es.avalon;

import java.util.Scanner;

public class Principal5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("introduce isbn:");
		Scanner sc=new Scanner(System.in);
		String isbn=sc.nextLine();
		System.out.println("introduce titulo:  ");
		String titulo=sc.nextLine();
		
		System.out.println(isbn);
		System.out.println(titulo);
	}

}
