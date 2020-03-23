package es.avalon.jdbc3Factura;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import es.avalon.jdbc2.Libro;

public class Factura {

	private int numero;
	private String concepto;
	private int importe;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public int getImporte() {
		return importe;
	}

	public void setImporte(int importe) {
		this.importe = importe;
	}

	public Factura(int numero, String concepto, int importe) {
		super();
		this.numero = numero;
		this.concepto = concepto;
		this.importe = importe;
	}

	public Factura(int numero) {
		super();
		this.numero = numero;
	}

	public void insertar() {

		String consulta = "insert into Facturas (numero,concepto,importe) values";
		consulta = consulta + "('" + this.getNumero() + "','" + this.getConcepto() + "','" + this.getImporte() + "')";
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

		String consulta = "delete from Facturas where numero='" + getNumero() + "'";

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
		System.out.println("borrado correcto");
	}

	public void actualizar() {

		String consulta = "update Facturas set concepto='" + getConcepto() + "',importe='" + getImporte()
				+ "' where numero='" + getNumero() + "'";

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
		System.out.println("actualizacion correcto");
	}

	public static ArrayList<Factura> buscarTodos() {

		Connection conexion;
		String url = "jdbc:mysql://localhost:3306/biblioteca";
		String usuario = "root";
		String clave = "";
		String consulta = "select * from Facturas";

		// Genero una lista de libros para trabajar de una forma natural con
		// programacion orientada a objeto
		ArrayList<Factura> lista = new ArrayList<Factura>();

		try {
			conexion = DriverManager.getConnection(url, usuario, clave);
			Statement sentencia = conexion.createStatement();
			ResultSet rs = sentencia.executeQuery(consulta);

			while (rs.next()) {

				Factura factura = new Factura(rs.getInt("numero"), rs.getString("concepto"), rs.getInt("importe"));
				lista.add(factura);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		// Retorno la lista
		return lista;

	}
}
