package es.avalon.jdbc;

import java.util.Scanner;

public class Principal8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce ISBN:");
		Scanner sc = new Scanner(System.in);
		String isbn = sc.nextLine();
		
		System.out.println("Introduce titulo:");
		String titulo = sc.nextLine();
		
		System.out.println("Introduce autor:");
		String autor = sc.nextLine();
		
		System.out.println("Introduce precio:");
		int precio = Integer.parseInt(sc.nextLine());
		
		System.out.println("Introduce categoria:");
		String categoria = sc.nextLine();
		
		Libro libro = new Libro(isbn, titulo, autor, precio, categoria);
		libro.insertar();

	}

}
