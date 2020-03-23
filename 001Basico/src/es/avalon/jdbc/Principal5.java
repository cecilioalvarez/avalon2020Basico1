package es.avalon.jdbc;

import java.util.Scanner;

//Usar scanner para insertar los datos en la BBDD
//imprimir datos por pantalla
//imprime query
//ejecuta

public class Principal5 {

	public static void main(String[] args) {
		
		System.out.println("Introduce ISBN:");
		Scanner sc = new Scanner(System.in);
		String isbn = sc.nextLine();
		
		System.out.println("Introduce titulo:");
		String titulo = sc.nextLine();
		
		System.out.println("Introduce autor:");
		String autor = sc.nextLine();
		
		System.out.println("Introduce precio:");
		String precio = sc.nextLine();
		
		System.out.println("Introduce categoria:");
		String categoria = sc.nextLine();
		
		System.out.println(isbn+titulo+autor+precio+categoria);



	}

}
