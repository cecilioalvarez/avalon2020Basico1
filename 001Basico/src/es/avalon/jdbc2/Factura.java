package es.avalon.jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import es.avalon.jdbc.Libro;

public class Factura {
	
	private int numero;
	private String concepto;
	private double importe;
	
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
	public void setImporte(double importe) {
		this.importe = importe;
	}
	
	public Factura(int numero, String concepto, double importe) {
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

		String consulta = "insert into Facturas (numero,concepto,importe) values " + "('" + this.getNumero()
				+ "','" + this.getConcepto() + "','" + this.getImporte() +  "')";

		Connection conexion;

		String url = "jdbc:mysql://localhost:3306/biblioteca";
		String usuario = "root";
		String clave = "";

		try {
			conexion = DriverManager.getConnection(url, usuario, clave);
			Statement sentencia = conexion.createStatement();
			sentencia.execute(consulta);

			System.out.println(conexion);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void eliminar() {

		Connection conexion;

		String url = "jdbc:mysql://localhost:3306/biblioteca";
		String usuario = "root";
		String clave = "";

		String consulta = "delete from Facturas where numero='" + this.getNumero() + "'";

		try {
			conexion = DriverManager.getConnection(url, usuario, clave);
			Statement sentencia = conexion.createStatement();
			sentencia.execute(consulta);

			System.out.println(conexion);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void actualizar() {
		Connection conexion;

		String url = "jdbc:mysql://localhost:3306/biblioteca";
		String usuario = "root";
		String clave = "";

		String consulta = "update Facturas set concepto='" + this.getConcepto() + "', importe=" + this.getImporte()
		+ " where numero=" + this.getNumero();

		try {
			conexion = DriverManager.getConnection(url, usuario, clave);
			Statement sentencia = conexion.createStatement();
			sentencia.execute(consulta);

			System.out.println(conexion);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
public static ArrayList<Factura> buscarTodos() {
		
		Connection conexion;

		String url = "jdbc:mysql://localhost:3306/biblioteca";
		String usuario = "root";
		String clave = "";

		String consulta = "select * from Facturas";
		
		ArrayList<Factura> lista = new ArrayList<Factura>();

		try {
			conexion = DriverManager.getConnection(url, usuario, clave);
			Statement sentencia = conexion.createStatement();
			ResultSet rs = sentencia.executeQuery(consulta);

			while (rs.next()) {
				
				Factura factura = new Factura(rs.getInt("numero"),
				rs.getString("concepto"),
				rs.getDouble("importe"));
				
				lista.add(factura);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}


}
