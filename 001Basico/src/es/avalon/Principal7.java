package es.avalon;

import java.util.Scanner;

public class Principal7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("introduce isbn:");
		Scanner sc=new Scanner(System.in);
		String isbn=sc.nextLine();
		System.out.println("introduce titulo:  ");
		String titulo=sc.nextLine();
		System.out.println("introduce autor:  ");
		String autor=sc.nextLine();
		System.out.println("introduce precio:  ");
		String precio=sc.nextLine();
		System.out.println("introduce categoria:  ");
		String categoria=sc.nextLine();
		
		System.out.println(isbn);
		System.out.println(titulo);
		System.out.println(autor);
		System.out.println(precio);
		System.out.println(categoria);
		
		Libro libro=new Libro (isbn,titulo,autor,Integer.parseInt(precio),categoria);
		libro.insertar();
	}

}
