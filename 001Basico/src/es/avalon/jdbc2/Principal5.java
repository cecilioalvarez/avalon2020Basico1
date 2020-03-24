package es.avalon.jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Principal5 {

	public static void main(String[] args) {

		Connection conexion;
		
		String url="jdbc:mysql://localhost:3306/biblioteca2";
		String usuario="root";
		String clave="";
		String consulta="select * from libros where titulo=?";
		
		try {
			conexion=DriverManager.getConnection(url,usuario,clave);
			PreparedStatement sentencia = conexion.prepareStatement(consulta);
			sentencia.setString(1, "Java1");
			ResultSet rs= sentencia.executeQuery();
			
			//visualizar
			while (rs.next()){
				System.out.print(rs.getString("isbn"));
				System.out.print(rs.getString("titulo"));
				System.out.print(rs.getString("autor"));
				System.out.print(rs.getInt("precio"));
				System.out.print(rs.getString("categoria_nombre"));
				System.out.println();
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
