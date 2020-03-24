package es.avalon.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Factura {

	private int numero;
	private String concepto;
	private float importe;
	
	public Factura(int numero) {
		super();
		this.numero = numero;
	}

	public Factura(int numero, String concepto, float importe) {
		super();
		this.numero = numero;
		this.concepto = concepto;
		this.importe = importe;
	}

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

	public double getImporte() {
		return importe;
	}

	public void setImporte(float importe) {
		this.importe = importe;
	}
	
	public void insertar() {

		Connection conexion;
		String url = "jdbc:mysql://localhost:3306/biblioteca";
		String usuario = "root";
		String clave = "";
		String consulta = "insert into Factura(numero,concepto,importe) values ('" + this.getNumero() + "' , '"
				+ this.getConcepto() + "' , '" + this.getImporte() + "')";

		try {
			conexion = DriverManager.getConnection(url, usuario, clave);
			Statement sentencia = conexion.createStatement();
			sentencia.execute(consulta);
			System.out.println("Fila añadida correctamente");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void borrarBynumero(int numero) {

		Connection conexion;
		String url = "jdbc:mysql://localhost:3306/biblioteca";
		String usuario = "root";
		String clave = "";
		String consulta = "delete from factura where numero = '" + numero + "'";

		try {
			conexion = DriverManager.getConnection(url, usuario, clave);
			Statement sentencia = conexion.createStatement();
			sentencia.execute(consulta);
			System.out.println("Borrado con exito");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static ArrayList<Factura> mostrarTodo() {

		Connection conexion;
		String url = "jdbc:mysql://localhost:3306/biblioteca";
		String usuario = "root";
		String clave = "";
		String consulta = "select * from factura";
		ArrayList<Factura> lista = new ArrayList<Factura>();

		try {
			conexion = DriverManager.getConnection(url, usuario, clave);
			Statement sentencia = conexion.createStatement();
			ResultSet rs = sentencia.executeQuery(consulta);
			
			while (rs.next()) {
				Factura factura = new Factura(rs.getInt("numero"), rs.getString("concepto"), rs.getFloat("importe"));
				lista.add(factura);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lista;
	}
	
	public void actulizaByisbn() {

		Connection conexion;
		String url = "jdbc:mysql://localhost:3306/biblioteca";
		String usuario = "root";
		String clave = "";
		String consulta = "update factura set concepto = '" + getConcepto() + "', importe = '" + getNumero() + "' where numero = '" + getNumero() + "'  ";

		try {
			conexion = DriverManager.getConnection(url, usuario, clave);
			Statement sentencia = conexion.createStatement();
			sentencia.execute(consulta);
			System.out.println("La factura se ha actualizado correctamente");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
