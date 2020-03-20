package es.avalon.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Principal {

	public static void main(String[] args) {

		Connection conexion;
		String url = "jdbc:mysql://localhost:3306/biblioteca";
		String usuario = "root";
		String clave = "";

		try {
			conexion = DriverManager.getConnection(url, usuario, clave);
			System.out.println(conexion);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
