package es.avalon.clases9.polimorfismoFacturas;

import java.util.ArrayList;

public class Principal {
	public static void main(String[] args) {
		
		
		Factura f2 = new FacturaNormal(2, "MacBook Pro 16", 5000);
		Factura f3 = new FacturaReducida(3, "Papel higienico", 10);
		Factura f4 = new FacturaSinIVA(4, "Algo", 50);
		
		ArrayList<Factura> lista = new ArrayList<Factura>();
		
		
		lista.add(f2);
		lista.add(f3);
		lista.add(f4);
		
		for (Factura unaFactura: lista) {
			System.out.println(unaFactura.getImporteConIVA());
		}

		//¡DUDA! - ¿Por qué sale 10.700000000000001? 
		//Porque es un numero grande 
		//SOLUCION
		//- Redondear con paquete Math
		//- Variable BigDecimal para precision

		
		
	}

}
