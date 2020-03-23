package es.avalon.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.*;

public class Principal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("intoduce titulo: ");
		System.out.println("intoduce autor: ");
		System.out.println("intoduce precio: ");
		System.out.println("intoduce categoria: ");
		System.out.println("intoduce isbn: ");
		Scanner sc= new Scanner (System.in);
		
		String titulo= sc.nextLine();
		String autor=sc.nextLine();
		int precio=Integer.parseInt(sc.nextLine());// para meter como int
		String categoria=sc.nextLine();
		String isbn= sc.nextLine();
	    
		
		System.out.println(titulo +" " +autor+" "+ precio+ " " + categoria+ " " + isbn);

		
		System.out.println("********************************");

Connection conexion;
String url="jdbc:mysql://localhost:3306/biblioteca";
String usuario="root";
String clave="";
// inserto nuevo registro
String consulta5= "insert into libros (titulo, autor, precio, categoria, isbn) values ('"+titulo+"', '"+autor+"', "+precio+", '"+categoria+"', '"+isbn+"' )";
System.out.println(consulta5); // para aprender que cambia 
try {
	conexion=DriverManager.getConnection(url, usuario,clave);
	/*
	 * sentencia de sql por lo tanto
	 * a la conecion que nos cree una opcion de ejecutar sentencia
	 */
	
	Statement sentencia =conexion.createStatement();
	sentencia.execute(consulta5);

} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
			}

}
