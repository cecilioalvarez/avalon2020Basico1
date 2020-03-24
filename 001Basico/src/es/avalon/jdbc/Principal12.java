package es.avalon.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;




public class Principal12 {

	public static void main(String[] args) {
		Connection conexion;
		String url = "jdbc:mysql://localhost:3306/biblioteca2";
		//String url2="jdbc:mysql://localhost/biblioteca;?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String usuario = "root";
		String clave = "";
		String consulta = "select * from Libros where titulo = ? ";

//		String variable="' or 0=0 //pepe";
//		
//		String otra="select * from autor where nombre='"+variable+"'";
		
		//System.out.println(otra);
		
		try {
			conexion = DriverManager.getConnection(url, usuario, clave);
			PreparedStatement sentencia = conexion.prepareStatement(consulta);
			sentencia.setString(1,"java2");
			ResultSet rs=sentencia.executeQuery();
			
			while(rs.next()) {
				
				System.out.print(rs.getString("isbn"));
				System.out.print(rs.getString("titulo"));
				System.out.print(rs.getString("autor"));
				System.out.print(rs.getInt("precio"));
				System.out.print(rs.getString("categoria_nombre"));
				System.out.println();
				
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
