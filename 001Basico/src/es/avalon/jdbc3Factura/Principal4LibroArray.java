package es.avalon.jdbc3Factura;

import java.util.ArrayList;

public class Principal4LibroArray {

	public static void main(String[] args) {

		//Guardo en lista la lista de elementos que me traigo con buscarTodos()
		ArrayList<Factura> lista=Factura.buscarTodos();
		
		for (Factura factura:lista) {
			System.out.print(factura.getNumero());
			System.out.print(factura.getConcepto());
			System.out.print(factura.getImporte());
			System.out.println();
		}

	}

}
