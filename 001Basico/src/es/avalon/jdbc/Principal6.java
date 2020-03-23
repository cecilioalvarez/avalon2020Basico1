package es.avalon.jdbc;

import java.util.Scanner;

public class Principal6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce isbn:  ");
		String isbn = sc.nextLine();
		
		System.out.print("Introduce titulo:  ");
		String titulo = sc.nextLine();
		
		System.out.print("Introduce autor:  ");
		String autor = sc.nextLine();
		
		System.out.print("Introduce precio:  ");
		int precio = Integer.parseInt(sc.nextLine());
		
		System.out.print("Introduce categoria:  ");
		String categoria = sc.nextLine();
		
		Libro libro=new Libro (isbn,titulo,autor,precio,categoria);
		libro.insertar();

	}

}
