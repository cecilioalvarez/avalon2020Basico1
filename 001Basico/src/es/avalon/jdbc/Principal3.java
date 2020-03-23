package es.avalon.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Principal3 {

	public static void main(String[] args) {
		Connection conexion;
		
		String url="jdbc:mysql://localhost:3306/biblioteca";
		String usuario="root";
		String clave="";
		String consulta="delete into Libros where autor='ana'";
		
		try {
			conexion=DriverManager.getConnection(url,usuario,clave);
			Statement sentencia= conexion.createStatement();
			sentencia.execute(consulta);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("borrado correcto");

	}

}
