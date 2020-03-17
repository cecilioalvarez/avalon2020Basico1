package es.avalon.Clases9Factura;

public class Principal {

	public static void main(String[] args) {

		Factura factura = new Factura(1,"prueba",100);
		FacturaNormal facturaNormal = new FacturaNormal(2,"pruebaNormal",100);
		FacturaSinIVA facturaSinIVA = new FacturaSinIVA(2,"pruebaSinIVA",100);
		FacturaReducida facturaReducida = new FacturaReducida(2,"pruebaReducida",100);
		
		System.out.println("Factura " + factura.getImporte());
		System.out.println("Factura normal " + facturaNormal.getImporte());
		System.out.println("Factura sin IVA " + facturaSinIVA.getImporte());
		System.out.println("Factura reducida " + facturaReducida.getImporte());
	}

}
