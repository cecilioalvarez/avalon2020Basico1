package es.avalon.jdbc3Factura;

import java.util.Scanner;

public class Principal1Insertar {

	public static void main(String[] args) {


			System.out.print("introduce numero: ");
			Scanner sc = new Scanner(System.in);
			int numero = Integer.parseInt(sc.nextLine());
			System.out.print("introduce concepto: ");
			String concepto = sc.nextLine();
			System.out.print("introduce importe: ");
			int importe = Integer.parseInt(sc.nextLine());
		
			
			Factura factura=new Factura (numero,concepto,importe);
			factura.insertar();


	}

}
