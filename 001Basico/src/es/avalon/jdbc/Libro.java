package es.avalon.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Libro {
private String titulo;
private String autor;
private int precio;
private String categoria;
private String isbn;



public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}
public String getAutor() {
	return autor;
}
public void setAutor(String autor) {
	this.autor = autor;
}
public int getPrecio() {
	return precio;
}
public void setPrecio(int precio) {
	this.precio = precio;
}
public String getCategoria() {
	return categoria;
}
public void setCategoria(String categoria) {
	this.categoria = categoria;
}
public String getIsbn() {
	return isbn;
}
public void setIsbn(String isbn) {
	this.isbn = isbn;
}

public Libro(String titulo, String autor, int precio, String categoria, String isbn) {
	super();
	this.titulo = titulo;
	this.autor = autor;
	this.precio = precio;
	this.categoria = categoria;
	this.isbn = isbn;
}
	public Libro(String isbn) {
		super();
	
		this.isbn = isbn;
}
	
	public void insertar(){
		String consulta= "insert into libros (titulo, autor, precio, categoria, isbn) values ('"+this.getTitulo()+"', '"+this.getAutor()+"', "+this.getPrecio()+", '"+this.getCategoria()+"', '"+this.getIsbn()+"' )";
		System.out.println(consulta); // para aprender que cambia 
		Connection conexion;
		String url="jdbc:mysql://localhost:3306/biblioteca";
		String usuario="root";
		String clave="";
		try {
			conexion=DriverManager.getConnection(url, usuario,clave);
			/*
			 * sentencia de sql por lo tanto
			 * a la conecion que nos cree una opcion de ejecutar sentencia
			 */
			
			Statement sentencia =conexion.createStatement();
			sentencia.execute(consulta);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
		
		public void borrar(){
			String consulta= "delete from libros where isbn=  '"+this.getIsbn()+"' ";
			System.out.println(consulta); // para aprender que cambia 
			Connection conexion;
			String url="jdbc:mysql://localhost:3306/biblioteca";
			String usuario="root";
			String clave="";
			try {
				conexion=DriverManager.getConnection(url, usuario,clave);
				/*
				 * sentencia de sql por lo tanto
				 * a la conecion que nos cree una opcion de ejecutar sentencia
				 */
				
				Statement sentencia =conexion.createStatement();
				sentencia.execute(consulta);

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
					}
		
		public void actualizar () {
			//mete el isbn y cambias todo el resto de datos
			Connection conexion;
			String url="jdbc:mysql://localhost:3306/biblioteca";
			String usuario="root";
			String clave="";
			String consulta2= "update libros set titulo='"+this.getTitulo()+"', autor= '"+this.getAutor()+"', precio= "+this.getPrecio()+", categoria= '"+this.getCategoria()+"' where isbn = '"+this.getIsbn()+"'";
			System.out.println(consulta2);
			try {
				conexion=DriverManager.getConnection(url, usuario,clave);
				/*
				 * sentencia de sql por lo tanto
				 * a la conecion que nos cree una opcion de ejecutar sentencia
				 */
				
				Statement sentencia =conexion.createStatement();
				sentencia.execute(consulta2);

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
