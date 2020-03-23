package es.avalon.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("introduce isbn:  ");
		String isbn = sc.nextLine();
		System.out.println("introduce titulo:  ");
		String titulo = sc.nextLine();
		System.out.println("introduce autor:  ");
		String autor = sc.nextLine();
		System.out.println("introduce precio:  ");
		int precio = Integer.parseInt(sc.nextLine());
		System.out.println("introduce categoria:  ");
		String categoria = sc.nextLine();

		Connection conexion;
		String url = "jdbc:mysql://localhost:3306/biblioteca";
		String usuario = "root";
		String clave = "";
		String consulta = "insert into Libros(isbn,titulo,autor,precio,categoria) values ('" + isbn + "' , '" + titulo
				+ "' , '" + autor + "' , " + precio + " , '" + categoria + "')";
		System.out.println("Fila añadida correctamente");

		try {
			conexion = DriverManager.getConnection(url, usuario, clave);
			Statement sentencia = conexion.createStatement();
			sentencia.execute(consulta);
			System.out.println(conexion);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
