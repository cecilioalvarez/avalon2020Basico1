package es.avalon.jdbc1Inicial;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Principal3 {

	public static void main(String[] args) {

		Connection conexion;

		String url = "jdbc:mysql://localhost:3306/biblioteca";
		String usuario = "root";
		String clave = "";
		String consulta="delete from Libros where autor='ana'";

		try {
			conexion = DriverManager.getConnection(url, usuario, clave);
			
			Statement sentencia=conexion.createStatement();
			
			sentencia.execute(consulta); 
			

		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("borrado correcto");
	}

}
