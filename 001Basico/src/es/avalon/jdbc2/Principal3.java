package es.avalon.jdbc2;

import java.util.Scanner;

public class Principal3 {

	public static void main(String[] args) {
		
		// Edita una factura
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce numero:  ");
		int numero = Integer.parseInt(sc.nextLine());
		
		System.out.print("Actualizar concepto:  ");
		String concepto = sc.nextLine();
		
		System.out.print("Actualizar importe:  ");
		Float importe = Float.parseFloat(sc.nextLine());
		
		Factura factura=new Factura (numero, concepto, importe);
		factura.actualizar();

	}

}
