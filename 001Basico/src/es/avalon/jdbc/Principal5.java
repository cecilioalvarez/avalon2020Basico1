package es.avalon.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import com.mysql.cj.xdevapi.Statement;

public class Principal5 {

	public static void main(String[] args) {
		
		Connection conexion;
		String url ="jdbc:mysql://localhost/biblioteca?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String usuario = "root";
		String clave = "";
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("introduce isbn: ");
		String isbn=sc.nextLine();
		System.out.print("introduce titulo: ");
		String titulo=sc.nextLine();
		System.out.print("introduce autor: ");
		String autor=sc.nextLine();
		System.out.print("introduce precio: ");
		int precio=Integer.parseInt(sc.nextLine());
		System.out.print("introduce categoria: ");
		String categoria=sc.nextLine();
		
		System.out.println(isbn);
		System.out.println(titulo);
		System.out.println(autor);
		System.out.println(precio);
		System.out.println(categoria);
		

		String consulta = "insert into Libros (isbn,titulo,autor,precio,categoria) values ('"+isbn+"','"+titulo+"','"+autor+"',"+precio+",'"+categoria+"')";

		try {
			conexion = DriverManager.getConnection(url, usuario, clave);
			Statement sentencia = (Statement) conexion.createStatement();
			sentencia.execute();
			System.out.println(conexion);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
	}

}
