package es.avalon.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Principal {

	public static void main(String[] args) {
		
		Connection conexion;
		String url="jdbc:mysql://localhost:3306/biblioteca";
		String usuario="root";
		String clave="";
		String consulta="insert into Libros (isbn,titulo,autor,precio,categoria) values ('5','net','juan',20,'web')";
		
		
		
		try {
			conexion=DriverManager.getConnection(url,usuario,clave);
			
			//sentencia SQL por lo tanto
			// a la conexion que nos cree una opcion de ejecutar una sentencia
			Statement sentencia=conexion.createStatement();
			sentencia.execute(consulta);
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
