package es.avalon.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Principal5 {

	public static void main(String[] args) {
		
		System.out.print("introduce isbn:  ");
		Scanner sc= new Scanner(System.in);
		String isbn=sc.nextLine();
		System.out.print("introduce titulo:  ");
		String titulo=sc.nextLine();
		System.out.print("introduce autor:  ");
		String autor=sc.nextLine();
		
		System.out.print("introduce precio:  ");
		int precio=Integer.parseInt(sc.nextLine());
		
		System.out.print("introduce categoria:  ");
		String categoria=sc.nextLine();
		
		/*
	
		System.out.println(isbn);
		System.out.println(titulo);
		System.out.println(autor);
		System.out.println(precio);
		System.out.println(categoria);
		*/
		String consulta= "insert into Libros (isbn,titulo,autor,precio,categoria) values";
		consulta=consulta+ " (' "+isbn+ " ',' "+titulo+" ',' "+autor+" ', "+precio+" ,' "+categoria+" ')";
		System.out.println(consulta);

		Connection conexion;
		String url="jdbc:mysql://localhost:3306/biblioteca";
		String usuario="root";
		String clave="";
			
		
		try {
			conexion=DriverManager.getConnection(url,usuario,clave);
			
			//sentencia SQL por lo tanto
			// a la conexion que nos cree una opcion de ejecutar una sentencia
			Statement sentencia=conexion.createStatement();
			sentencia.execute(consulta);
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
