package es.avalon.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Principal4 {

	public static void main(String[] args) {

		Connection conexion;

		String url = "jdbc:mysql://localhost:3306/biblioteca";
		String usuario = "root";
		String clave = "";
		String consulta="update set autor='cecilio' where isbn='5', categoria='programacion' where isbn='5'";

		try {
			conexion = DriverManager.getConnection(url, usuario, clave);
			
			Statement sentencia=conexion.createStatement();
	
			sentencia.executeUpdate(consulta); 
			

		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("actualizacion correcta");
	}

}
