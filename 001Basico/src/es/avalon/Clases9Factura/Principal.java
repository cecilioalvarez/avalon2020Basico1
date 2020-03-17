package es.avalon.Clases9Factura;

public class Principal {

	public static void main(String[] args) {

		Factura factura = new Factura(1,"prueba",100);
		FacturaNormal facturaNormal = new FacturaNormal(2,"pruebaNormal",100);
		FacturaSinIVA facturaSinIVA = new FacturaSinIVA(2,"pruebaSinIVA",100);
		FacturaReducida facturaReducida = new FacturaReducida(2,"pruebaReducida",100);
		
		System.out.println(factura.getImporte());
		System.out.println(facturaNormal.getImporte());
		System.out.println(facturaSinIVA.getImporte());
		System.out.println(facturaReducida.getImporte());
	}

}
