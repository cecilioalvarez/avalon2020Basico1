package es.avalon.jdbc;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal2 {

	public static void main(String[] args) {

		Factura facturaNueva = new Factura(3, "FacturaNueva", 123456);
		facturaNueva.insertar();

		mostrarBBDD();

		Factura facturaActual = new Factura(3, "Factura Actual", 112.12F);
		facturaActual.actulizaByisbn();

		mostrarBBDD();

		Factura.borrarBynumero(3);

		mostrarBBDD();
	}

	private static void mostrarBBDD() {
		ArrayList<Factura> facturas = Factura.mostrarTodo();

		for (Factura i : facturas) {

			System.out.print(i.getNumero() + " ");
			System.out.print(i.getConcepto() + " ");
			System.out.println(i.getImporte());
		}
		System.out.println();
	}

}
