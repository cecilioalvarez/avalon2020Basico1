package es.avalon.jdbc2;

import java.util.ArrayList;

public class Principal4 {

	public static void main(String[] args) {
		
		// Busca todas las facturas
		ArrayList<Factura> lista= Factura.buscarTodos();
		System.out.println("Numero     Concepto      Importe");
		for (Factura factura:lista) {
			
			System.out.print("  "+factura.getNumero()+"         ");
			System.out.print(factura.getConcepto()+"         ");
			System.out.print(factura.getImporte());
			
			System.out.println();
		}

	}

}
