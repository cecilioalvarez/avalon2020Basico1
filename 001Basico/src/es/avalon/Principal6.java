package es.avalon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Principal6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("introduce isbn:");
		Scanner sc=new Scanner(System.in);
		String isbn=sc.nextLine();
		System.out.println("introduce titulo:  ");
		String titulo=sc.nextLine();
		System.out.println("introduce autor:  ");
		String autor=sc.nextLine();
		System.out.println("introduce precio:  ");
		String precio=sc.nextLine();
		System.out.println("introduce categoria:  ");
		String categoria=sc.nextLine();
		
		System.out.println(isbn);
		System.out.println(titulo);
		System.out.println(autor);
		System.out.println(precio);
		System.out.println(categoria);
		
		// mostrar la consulta bien construida
		String consulta="insert into Libros (isbn,titulo,autor,precio,categoria) values ('"+isbn+"','"+titulo+"','"+autor+"',"+precio+",'"+categoria+"')";
		System.out.println(consulta);
		
		Connection conexion;
		String url="jdbc:mysql://localhost:3306/biblioteca";
		String usuario="root";
		String clave="";
		//String consulta="insert into Libros (isbn,titulo,autor,precio,categoria) values ('"+isbn+"','"+titulo+"','"+autor+"',"+precio+",'"+categoria+"')";
		
		try {
			conexion=DriverManager.getConnection(url,usuario,clave);
			
			// sentencia SQL por lo tanto
			// a la conexion que nos cree una opcion de ejecutar una sentencia
			Statement sentencia=conexion.createStatement();
			sentencia.execute(consulta);
			
			System.out.println(conexion);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
