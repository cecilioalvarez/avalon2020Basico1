package es.avalon.jdbc2;

import java.util.Scanner;

import es.avalon.jdbc.Libro;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Introduce Numero:");
		Scanner sc = new Scanner(System.in);
		int numero = Integer.parseInt(sc.nextLine());
		
		System.out.println("Introduce Concepto:");
		String concepto = sc.nextLine();
		
		System.out.println("Introduce Importe:");
		double importe = Double.parseDouble(sc.nextLine());
		
		
		Factura factura = new Factura(numero, concepto, importe);
		factura.insertar();

	}

}
