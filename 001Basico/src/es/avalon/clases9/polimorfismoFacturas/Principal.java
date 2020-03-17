package es.avalon.clases9.polimorfismoFacturas;

public class Principal {
	public static void main(String[] args) {
		
		Factura f1 = new Factura(1, "iPhone 11 Pro Max", 1500);
		FacturaNormal f2 = new FacturaNormal(2, "MacBook Pro 16", 5000);
		FacturaReducida f3 = new FacturaReducida(3, "Papel higienico", 10);
		FacturaSinIVA f4 = new FacturaSinIVA(4, "Cocaina", 60);
		
		System.out.println(f1.getImporteConIVA());
		System.out.println(f2.getImporteConIVA());
		//¡DUDA! - ¿Por qué sale 10.700000000000001?
		System.out.println(f3.getImporteConIVA());
		System.out.println(f4.getImporteConIVA());
		
		System.out.println();
		System.out.println("*******************");
		System.out.println(f2.getNumero());
		System.out.println(f3.getConcepto());
		System.out.println(f4.getImporte());
		
	}

}
