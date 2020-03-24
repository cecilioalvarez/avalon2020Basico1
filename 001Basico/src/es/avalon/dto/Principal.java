package es.avalon.dto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Principal {

	public static void main(String[] args) {
		Connection conexion;
		
		String url="jdbc:mysql://localhost:3306/biblioteca2";
		String usuario="root";
		String clave="";
		//inner join
		String consulta="SELECT * from libros inner join categoria on categoria.nombre= libros.categoria_nombre"; 
		
		try {
			conexion=DriverManager.getConnection(url,usuario,clave);
			Statement sentencia= conexion.createStatement();
			ResultSet rs= sentencia.executeQuery(consulta);
			//visualizar
			while (rs.next()){
				System.out.print(rs.getString("isbn")+" ");
				System.out.print(rs.getString("titulo")+" ");
				System.out.print(rs.getString("autor")+" ");
				System.out.print(rs.getInt("precio")+" ");
				System.out.print(rs.getString("categoria_nombre")+" ");
				System.out.print(rs.getString("descripcion"));
				System.out.println();
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
