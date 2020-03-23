package es.avalon.jdbc2;

import java.util.Scanner;

public class Principal2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce numero:  ");
		int numero = Integer.parseInt(sc.nextLine());
		
		Factura factura=new Factura (numero);
		factura.borrar();

	}

}
