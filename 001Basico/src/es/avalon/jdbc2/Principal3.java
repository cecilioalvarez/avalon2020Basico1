package es.avalon.jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Principal3 {

	public static void main(String[] args) {

		// Programa lea los datos, nos imprima la consulta y lo mete en la base de datos

		// Leo los datos
		System.out.print("introduce isbn: ");
		Scanner sc = new Scanner(System.in);
		String isbn = sc.nextLine();
		System.out.print("introduce titulo: ");
		String titulo = sc.nextLine();
		System.out.print("introduce autor: ");
		String autor = sc.nextLine();
		System.out.print("introduce precio: ");
		String precio = sc.nextLine();
		System.out.print("introduce categoria: ");
		String categoria = sc.nextLine();
		System.out.print("introduce categoria: ");

		// Imprimo la consulta
		/*
		System.out.println(isbn);
		System.out.println(titulo);
		System.out.println(autor);
		System.out.println(precio);
		System.out.println(categoria);
		*/
		String consulta = "insert into Libros (isbn,titulo,autor,precio,categoria) values";
		consulta = consulta + "('" + isbn + "','" + titulo + "','" + autor + "','" + precio + "','" + categoria + "')";
		System.out.println(consulta);

		// Meter los datos a la base de datos
		Connection conexion;

		String url = "jdbc:mysql://localhost:3306/biblioteca";
		String usuario = "root";
		String clave = "";

		try {
			conexion = DriverManager.getConnection(url, usuario, clave);

			// Sentencia SQL, por lo tanto le pedimos a la conexion que nos cree una opion
			// de ejecutar una sentencia
			Statement sentencia = conexion.createStatement();
			sentencia.execute(consulta);

			System.out.println(conexion);

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
