package es.avalon.jdbc;

import java.util.Scanner;

public class Principal8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce isbn:  ");
		String isbn = sc.nextLine();
		
		System.out.print("Actualizar titulo:  ");
		String titulo = sc.nextLine();
		
		System.out.print("Actualizar autor:  ");
		String autor = sc.nextLine();
		
		System.out.print("Actualizar precio:  ");
		int precio = Integer.parseInt(sc.nextLine());
		
		System.out.print("Actualizar categoria:  ");
		String categoria = sc.nextLine();
		
		Libro libro=new Libro (isbn,titulo,autor,precio,categoria);
		libro.actualizar();

	}

}
