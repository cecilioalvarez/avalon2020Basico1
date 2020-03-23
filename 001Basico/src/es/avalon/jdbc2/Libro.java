package es.avalon.jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Libro {

	private String isbn;
	private String titulo;
	private String autor;
	private int precio;
	private String categoria;

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

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

	public Libro(String isbn, String titulo, String autor, int precio, String categoria) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
		this.categoria = categoria;
	}

	public Libro(String isbn) {
		super();
		this.isbn = isbn;
	}

	public void insertar() {

		String consulta = "insert into Libros (isbn,titulo,autor,precio,categoria) values";
		consulta = consulta + "('" + this.getIsbn() + "','" + this.getTitulo() + "','" + this.getAutor() + "','"
				+ this.getPrecio() + "','" + this.getCategoria() + "')";
		System.out.println(consulta);

		// Meter los datos a la base de datos
		Connection conexion;
		String url = "jdbc:mysql://localhost:3306/biblioteca";
		String usuario = "root";
		String clave = "";

		try {
			conexion = DriverManager.getConnection(url, usuario, clave);

			// Sentencia SQL, por lo tanto le pedimos a la conexion que nos cree una opion
			// de ejecutar una sentencia
			Statement sentencia = conexion.createStatement();
			sentencia.execute(consulta);

			System.out.println(conexion);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void borrar() {
		String consulta = "delete from Libros where isbn='" + getIsbn() + "'";

		Connection conexion;
		String url = "jdbc:mysql://localhost:3306/biblioteca";
		String usuario = "root";
		String clave = "";

		try {
			conexion = DriverManager.getConnection(url, usuario, clave);

			Statement sentencia = conexion.createStatement();

			sentencia.execute(consulta);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("borrado correcto");
	}

	public void actualizar() {
		String consulta = "update Libros set titulo='" + getTitulo() + "', autor='" + getAutor() + "', precio='"
				+ getPrecio() + "' ,categoria='" + getCategoria() + "'where isbn='" + this.getIsbn() + "'";
		System.out.println(consulta);

		Connection conexion;
		String url = "jdbc:mysql://localhost:3306/biblioteca";
		String usuario = "root";
		String clave = "";

		try {
			conexion = DriverManager.getConnection(url, usuario, clave);

			Statement sentencia = conexion.createStatement();
			sentencia.executeUpdate(consulta);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("actualizacion correcta");
	}
	
	public static ArrayList<Libro> buscarTodos() {
	
	Connection conexion;
	String url = "jdbc:mysql://localhost:3306/biblioteca";
	String usuario = "root";
	String clave = "";
	String consulta="select * from Libros";
	
	//Genero una lista de libros para trabajar de una forma natural con programacion orientada a objeto
	ArrayList<Libro> lista=new ArrayList<Libro>();

	try {
		conexion = DriverManager.getConnection(url, usuario, clave);
		Statement sentencia=conexion.createStatement();	
		ResultSet rs=sentencia.executeQuery(consulta);
		
		while(rs.next()) {
			//Genero un nuevo libro
			//Al nuevo libro le asigno los datos que me vienen en el resultSet
			//Propiedad por propiedad
			Libro libro = new Libro(rs.getString("isbn"),rs.getString("titulo"),rs.getString("autor"),rs.getInt("precio"),rs.getString("categoria"));
			//Añado cada libro a la lista
			lista.add(libro);
		}
		

	} catch (SQLException e) {
		e.printStackTrace();
	}
	//Retorno la lista
	return lista;

}
}

