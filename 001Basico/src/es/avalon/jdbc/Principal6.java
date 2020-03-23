package es.avalon.jdbc;

import java.util.Scanner;

//Usar scanner para insertar los datos en la BBDD
//imprimir datos por pantalla 
//imprime query
//ejecuta

public class Principal6 {

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
		
		
		String consulta = "insert into Libros (isbn,titulo,autor,precio,categoria) values "
				+ "('" +isbn +"','"+titulo+"','"+autor+"',"+precio+",'"+categoria+"')";
	
		System.out.println(consulta);



	}

}
