package es.avalon.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Libro {

	private String isbn;
	private String titulo;
	private String autor;
	private int precio;
	private String categoria;

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

	public void actulizaByisbn() {

		Connection conexion;
		String url = "jdbc:mysql://localhost:3306/biblioteca";
		String usuario = "root";
		String clave = "";
		String consulta = "update Libros set titulo = '" + getTitulo() + "' , autor = '" + getAutor()
				+ "', precio = '" + getPrecio() + "' , categoria = '" + getCategoria() + "' where isbn = '" + getIsbn() + "' ";

		try {
			conexion = DriverManager.getConnection(url, usuario, clave);
			Statement sentencia = conexion.createStatement();
			sentencia.execute(consulta);
			System.out.println("El libro se ha actualizado correctamente");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void insertar() {

		Connection conexion;
		String url = "jdbc:mysql://localhost:3306/biblioteca";
		String usuario = "root";
		String clave = "";
		String consulta = "insert into Libros(isbn,titulo,autor,precio,categoria) values ('" + this.getIsbn() + "' , '"
				+ this.getTitulo() + "' , '" + this.getCategoria() + "' , " + this.getPrecio() + " , '"
				+ this.getCategoria() + "')";

		try {
			conexion = DriverManager.getConnection(url, usuario, clave);
			Statement sentencia = conexion.createStatement();
			sentencia.execute(consulta);
			System.out.println("Fila añadida correctamente");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void borrarByisbn(String isbn) {

		Connection conexion;
		String url = "jdbc:mysql://localhost:3306/biblioteca";
		String usuario = "root";
		String clave = "";
		String consulta = "delete from Libros where isbn = '" + isbn + "'";

		try {
			conexion = DriverManager.getConnection(url, usuario, clave);
			Statement sentencia = conexion.createStatement();
			sentencia.execute(consulta);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
