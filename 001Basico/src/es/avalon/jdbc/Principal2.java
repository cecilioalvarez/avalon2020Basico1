package es.avalon.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Principal2 {

	public static void main(String[] args) {
		Connection conexion;
		String url ="jdbc:mysql://localhost/biblioteca;?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String usuario = "root";
		String clave = "";
		String consulta = "insert into Libros (isbn,titulo,autor,precio,categoria) values ('8','net','juan',20,'web')";

		try {
			conexion = DriverManager.getConnection(url, usuario, clave);
			Statement sentencia = conexion.createStatement();
			ResultSet rs=sentencia.executeQuery(consulta);
			
			while(rs.next()) {
				System.out.print(rs.getString("isbn"));
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
