package es.avalon.jdbc2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Añade una factura
		System.out.print("Introduce numero:  ");
		int numero = Integer.parseInt(sc.nextLine());
		
		System.out.print("Introduce concepto:  ");
		String concepto = sc.nextLine();
		
		System.out.print("Introduce importe:  ");
		Float importe = Float.parseFloat(sc.nextLine());
		
		Factura factura=new Factura (numero, concepto, importe);
		factura.insertar();

	}

}
