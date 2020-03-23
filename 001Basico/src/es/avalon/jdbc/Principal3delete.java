package es.avalon.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;
import java.sql.Statement;

public class Principal3delete {

	public static void main(String[] args) {
		Connection conexion;
		String url ="jdbc:mysql://localhost/biblioteca?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String usuario = "root";
		String clave = "";
		String consulta = "delete from Libros where autor='juan'";

		try {
			conexion = DriverManager.getConnection(url, usuario, clave);
			Statement sentencia = conexion.createStatement();
			sentencia.execute(consulta);
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}


