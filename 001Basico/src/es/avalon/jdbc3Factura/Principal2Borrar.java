package es.avalon.jdbc3Factura;

import java.util.Scanner;

public class Principal2Borrar {

	public static void main(String[] args) {


		System.out.print("introduce numero: ");
		Scanner sc = new Scanner(System.in);
		int numero = Integer.parseInt(sc.nextLine());
				
		Factura factura=new Factura (numero);
		factura.borrar();

	}
}
