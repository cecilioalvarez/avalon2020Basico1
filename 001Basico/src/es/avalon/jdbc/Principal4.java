package es.avalon.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Principal4 {

	public static void main(String[] args) {
		Connection conexion;
		String url ="jdbc:mysql://localhost/biblioteca?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String usuario = "root";
		String clave = "";
		String consulta = "update Libros set autor='cecilio', categoria='programacion' where isbn='8'";

		try {
			conexion = DriverManager.getConnection(url, usuario, clave);
			Statement sentencia = conexion.createStatement();
			sentencia.executeUpdate(consulta);
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
