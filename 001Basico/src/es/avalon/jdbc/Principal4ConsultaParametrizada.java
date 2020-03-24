package es.avalon.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import es.avalon.jdbcDTO.LibroDTO;

public class Principal4ConsultaParametrizada {

	public static void main(String[] args) {

		Connection conexion;
		String url = "jdbc:mysql://localhost:3306/biblioteca2";
		String usuario = "root";
		String clave = "";
		String consulta = "select * from libros where titulo =?";

		try {
			conexion = DriverManager.getConnection(url, usuario, clave);
			PreparedStatement sentencia = conexion.prepareStatement(consulta);
			sentencia.setString(1, "java2");
			ResultSet rs = sentencia.executeQuery();

			while (rs.next()) {
				System.out.print(rs.getString("isbn") + " ");
				System.out.print(rs.getString("titulo") + " ");
				System.out.print(rs.getString("autor") + " ");
				System.out.print(rs.getString("precio") + " ");
				System.out.println(rs.getString("categoria_nombre") + " ");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
