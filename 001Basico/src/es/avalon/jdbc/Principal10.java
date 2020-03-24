package es.avalon.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Principal10 {

	public static void main(String[] args) {
		
		Connection conexion;
		String url = "jdbc:mysql://localhost:3306/biblioteca2";
		//String url2="jdbc:mysql://localhost/biblioteca;?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String usuario = "root";
		String clave = "";
		String consulta = "select * from Libros inner Join Categoria on Categoria.nombre=libros.categoria_nombre";

		try {
			conexion = DriverManager.getConnection(url, usuario, clave);
			Statement sentencia = conexion.createStatement();
			ResultSet rs=sentencia.executeQuery(consulta);
			
			while(rs.next()) {
				
				System.out.print(rs.getString("isbn"));
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
