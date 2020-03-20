package es.avalon.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Principal {

	public static void main(String[] args) {
		Connection conexion;
		String url = "jdbc:mysql://localhost:3306/biblioteca";
		String usuario = "root";
		String clave = "";
		String consulta = "insert into Libros(isbn,titulo,autor,precio,categoria)values('5','net','juan',20,'web')";

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
