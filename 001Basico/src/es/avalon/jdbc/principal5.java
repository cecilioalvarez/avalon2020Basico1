package es.avalon.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class principal5 {

	public static void main(String[] args) {
		System.out.print("Introduce isbn:  ");
		Scanner sc = new Scanner(System.in);
		String isbn = sc.nextLine();
		System.out.print("Introduce titulo:  ");
		String titulo = sc.nextLine();
		System.out.print("Introduce autor:  ");
		String autor = sc.nextLine();
		System.out.print("Introduce precio:  ");
		int precio = Integer.parseInt(sc.nextLine());
		System.out.print("Introduce categoria:  ");
		String categoria = sc.nextLine();

		Connection conexion;
		String url = "jdbc:mysql://localhost:3306/biblioteca";
		String usuario = "root";
		String clave = "";

		/*
		 * System.out.println(isbn); 
		 * System.out.println(titulo);
		 * System.out.println(autor); 
		 * System.out.println(precio);
		 * System.out.println(categoria);
		 */
		String consulta = "insert into Libros (isbn,titulo,autor,precio,categoria) values";
		consulta = consulta + "('" + isbn + "','" + titulo + "', '" + autor + "','" + precio + "', '" + categoria
				+ "')";
		System.out.println(consulta);

		try {
			conexion = DriverManager.getConnection(url, usuario, clave);
			Statement sentencia = conexion.createStatement();
			sentencia.execute(consulta);
			System.out.println(conexion);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
