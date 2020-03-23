package es.avalon.jdbc2;

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

	public float getImporte() {
		return importe;
	}

	public void setImporte(float importe) {
		this.importe = importe;
	}
	
	public Factura(int numero, String concepto, float importe) {
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
		Connection conexion;
		String url = "jdbc:mysql://localhost:3306/biblioteca";
		String usuario = "root";
		String clave = "";

		String consulta = "insert into Facturas (numero,concepto,importe) values";
		consulta = consulta 
		+ "('" 
		+ this.getNumero() + "','" 
		+ this.getConcepto() + "', '"  
		+ this.getImporte() 
		+"')";
		
		System.out.println(consulta);

		try {
			conexion = DriverManager.getConnection(url, usuario, clave);
			Statement sentencia = conexion.createStatement();
			sentencia.execute(consulta);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Insertado correcto");
	}
	
	public void borrar() {
		Connection conexion;
		String url = "jdbc:mysql://localhost:3306/biblioteca";
		String usuario = "root";
		String clave = "";
		
		String consulta = "delete from Facturas where numero='" + this.getNumero() + "'";
		System.out.println(consulta);
		
		try {
			conexion = DriverManager.getConnection(url, usuario, clave);
			Statement sentencia = conexion.createStatement();
			sentencia.execute(consulta);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Borrado correcto");
	}
	
	public void actualizar() {
		Connection conexion;
		String url = "jdbc:mysql://localhost:3306/biblioteca";
		String usuario = "root";
		String clave = "";
		
		String consulta = "update Facturas set "
				+ "concepto='" + this.getConcepto() 
				+ "', importe= '" + this.getImporte() 
				+"' where numero= '" + this.getNumero() + "'";
				
		System.out.println(consulta);
		
		try {
			conexion = DriverManager.getConnection(url, usuario, clave);
			Statement sentencia = conexion.createStatement();
			sentencia.execute(consulta);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Actualizacion correcta");
	}
	
	public static ArrayList <Factura> buscarTodos(){
        Connection conexion;
		
		String url="jdbc:mysql://localhost:3306/biblioteca";
		String usuario="root";
		String clave="";
		String consulta="select * from Facturas";
		// genero una lista de libros
		ArrayList<Factura> lista=new ArrayList<Factura>();
		
		try {
			conexion=DriverManager.getConnection(url,usuario,clave);
			Statement sentencia= conexion.createStatement();
			ResultSet rs= sentencia.executeQuery(consulta);
			//visualizar
			while (rs.next()){
				
				Factura factura = new Factura(rs.getInt("numero"),
						rs.getString("concepto"),
						rs.getFloat("importe"));
				lista.add(factura);
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// retorno la lista de objetos
		return lista;

	}

}
