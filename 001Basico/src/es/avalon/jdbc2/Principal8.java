package es.avalon.jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Principal8 {

	public static void main(String[] args) {
		
		Connection conexion;

		String url = "jdbc:mysql://localhost:3306/biblioteca2";
		String usuario = "root";
		String clave = "";
		String consulta="select*from Libros inner join Categoria on Categoria.nombre=libros.categoria_nombre";

		try {
			conexion = DriverManager.getConnection(url, usuario, clave);
			
			//Sentencia SQL, por lo tanto le pedimos a la conexion que nos cree una opion de ejecutar una sentencia
			Statement sentencia=conexion.createStatement();
			
			ResultSet rs=sentencia.executeQuery(consulta); //El objeto rs tiene los datos dentro		
		
		while(rs.next()) {
			System.out.print(rs.getString("isbn")); //Accedo a cada columna
			System.out.print(rs.getString("titulo"));
			System.out.print(rs.getString("autor"));
			System.out.print(rs.getInt("precio"));
			System.out.print(rs.getString("categoria_nombre"));
			System.out.print(rs.getString("descripcion"));
			System.out.println();
		}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
