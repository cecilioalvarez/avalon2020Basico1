package es.avalon.jdbc2;

import java.util.ArrayList;
import java.util.Scanner;

import es.avalon.jdbc.Libro;

public class Principal4 {

	public static void main(String[] args) {
		
		
		ArrayList<Factura> lista = Factura.buscarTodos();
		
		for (Factura factura: lista) {
			
			System.out.println(factura.getNumero());
			System.out.println(factura.getConcepto());
			System.out.println(factura.getImporte());
			System.out.println();
			
		}

	}

}
