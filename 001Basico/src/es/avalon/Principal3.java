package es.avalon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Principal3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// queremos seleccionar los registros
		
		Connection conexion;
		String url="jdbc:mysql://localhost:3306/biblioteca";
		String usuario="root";
		String clave="";
		String consulta="delete from Libros where autor='ana'";
		
		try {
			conexion=DriverManager.getConnection(url,usuario,clave);
			
			// sentencia SQL por lo tanto
			// a la conexion que nos cree una opcion de ejecutar una sentencia
			Statement sentencia=conexion.createStatement();
			sentencia.execute(consulta);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("borrado correcto");
	}

}
