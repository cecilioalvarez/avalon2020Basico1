package es.avalon.clases92PolimorfismoFacturas;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		
		Factura f= new FacturaConIVA(1,"ordenador",200);
		Factura f2= new FacturaSinIVA(2,"ordenador",200);
		Factura f3= new FacturaReducida(3,"tablet",100);
		
		
		ArrayList<Factura> lista= new ArrayList<Factura>();
		
		lista.add(f);
		lista.add(f2);
		lista.add(f3);
		
		for (Factura unaFactura:lista) {
			
			System.out.println(unaFactura.getImporteConIVA());
		}

	}

}
