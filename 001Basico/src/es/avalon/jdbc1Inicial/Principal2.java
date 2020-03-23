package es.avalon.jdbc1Inicial;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Principal2 {

	public static void main(String[] args) {

		Connection conexion;

		String url = "jdbc:mysql://localhost:3306/biblioteca";
		String usuario = "root";
		String clave = "";
		String consulta="select * from Libros";

		try {
			conexion = DriverManager.getConnection(url, usuario, clave);
			
			//Sentencia SQL, por lo tanto le pedimos a la conexion que nos cree una opion de ejecutar una sentencia
			Statement sentencia=conexion.createStatement();
			
			ResultSet rs=sentencia.executeQuery(consulta); //El objeto rs tiene los datos dentro
			
			while(rs.next()) {
				System.out.print(rs.getString("isbn")); //Accedo a cada columna
				System.out.print(rs.getString("titulo"));
				System.out.print(rs.getString("autor"));
				System.out.print(rs.getString("precio"));
				System.out.print(rs.getString("categoria"));
				System.out.println();
			}
			

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
