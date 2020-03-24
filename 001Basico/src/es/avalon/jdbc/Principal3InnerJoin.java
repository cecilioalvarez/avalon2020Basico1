package es.avalon.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Principal3InnerJoin {

	public static void main(String[] args) {

		Connection conexion;
		String url = "jdbc:mysql://localhost:3306/biblioteca2";
		String usuario = "root";
		String clave = "";
		String consulta = "SELECT * FROM libros INNER JOIN categoria on categoria.nombre=libros.categoria_nombre";

		try {
			conexion = DriverManager.getConnection(url, usuario, clave);
			Statement sentencia = conexion.createStatement();
			ResultSet rs = sentencia.executeQuery(consulta);
			while (rs.next()) {
				System.out.print(rs.getString("isbn")+ " ");
				System.out.print(rs.getString("titulo")+ " ");
				System.out.print(rs.getString("autor")+ " ");
				System.out.print(rs.getInt("precio")+ " ");
				System.out.print(rs.getString("categoria_nombre")+ " ");
				System.out.print(rs.getString("nombre")+ " ");
				System.out.println(rs.getString("descripcion")+ " ");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
