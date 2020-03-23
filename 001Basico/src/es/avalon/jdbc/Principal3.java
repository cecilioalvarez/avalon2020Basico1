package es.avalon.jdbc;

import java.util.Scanner;

public class Principal3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		System.out.println("intoduce titulo: ");
		String titulo= sc.nextLine();
		System.out.println("intoduce autor: ");
		String autor=sc.nextLine();
		System.out.println("intoduce precio: ");
		int precio=Integer.parseInt(sc.nextLine());// para meter como int
		System.out.println("intoduce categoria: ");
		String categoria=sc.nextLine();
		System.out.println("intoduce isbn: ");
		String isbn= sc.nextLine();	
		
		Libro libro= new Libro (titulo, autor, precio, categoria, isbn);
		libro.insertar();
		

		// ejemplo para borrar
		System.out.println("intoduce isbn que quieres borrar: ");
		String isbn2= sc.nextLine();	
		Libro libro2= new Libro (isbn2);
		libro2.borrar();
		
		// para actualizar
		//Scanner sc= new Scanner (System.in);
		System.out.println("intoduce cambio titulo: ");
		String titulo1= sc.nextLine();
		System.out.println("intoduce cambio autor: ");
		String autor1=sc.nextLine();
		System.out.println("intoduce cambio precio: ");
		int precio1=Integer.parseInt(sc.nextLine());// para meter como int
		System.out.println("intoduce cambio categoria: ");
		String categoria1=sc.nextLine();
		System.out.println("intoduce isbn: ");
		String isbn1= sc.nextLine();	
		
		Libro libro1= new Libro (titulo1, autor1, precio1, categoria1, isbn1);
		libro1.actualizar();
		
		
		
	}

}
