package es.avalon.jdbc;
import java.sql.*;
public class Principal {
	public static void main(String[]args) {
		Connection conexion;
		String url="jdbc:mysql://localhost:3306/biblioteca";
		String usuario="root";
		String clave="";
		// inserto nuevo registro
		//String consulta= "insert into libros (titulo, autor, precio, categoria, isbn) values ('net', 'juan', 20, 'web', '5' )";
		//seleccionar parte de la base de datos
		//String consulta2= "select * from libros";
		//para borrar
		//String consulta3= "delete from libros where autor='ana'";
		//para sustituir datos
	String consulta4 ="update libros set autor= 'cecilio' where isbn ='5'";
		try {
			conexion=DriverManager.getConnection(url, usuario,clave);
			/*
			 * sentencia de sql por lo tanto
			 * a la conecion que nos cree una opcion de ejecutar sentencia
			 */
			
			Statement sentencia =conexion.createStatement();			
		//	sentencia.execute(consulta);
			//propiedad next, cuando le doy a next, pasa de fila
		//	ResultSet rs=sentencia.executeQuery(consulta2);
			//para borrar
			//sentencia.execute(consulta3);
			// para sustituir
			sentencia.executeUpdate(consulta4);
//			while (rs.next()) {
//				System.out.println(rs.getString("titulo"));
//				System.out.println(rs.getString("autor"));
//				System.out.println(rs.getInt("precio")); //aunque vale tambien get Strign, + optimo getInt
//				System.out.println(rs.getString("categoria"));
//				System.out.println(rs.getString("isbn"));
//				System.out.println();
//				//si no pongo ln me sale todo en la misma fila amontonada
//			}
			
		//	System.out.println(conexion);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("actualizacion correcta");
		
	}

}
