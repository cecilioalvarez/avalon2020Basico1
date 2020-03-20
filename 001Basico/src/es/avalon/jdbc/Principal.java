package es.avalon.jdbc;
import java.sql.*;
public class Principal {
	public static void main(String[]args) {
		Connection conexion;
		String url="jdbc:mysql://localhost:3306/biblioteca";
		String usuario="root";
		String clave="";
		// inserto nuevo registro
		String consulta= "insert into libros (titulo, autor, precio, categoria, isbn) values ('net', 'juan', 20, 'web', '5' )";
		
		try {
			conexion=DriverManager.getConnection(url, usuario,clave);
			/*
			 * sentencia de sql por lo tanto
			 * a la conecion que nos cree una opcion de ejecutar sentencia
			 */
			
			Statement sentencia =conexion.createStatement();			
			sentencia.execute(consulta);
			
		//	System.out.println(conexion);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
