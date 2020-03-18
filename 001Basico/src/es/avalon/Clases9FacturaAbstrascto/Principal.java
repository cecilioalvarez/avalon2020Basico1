package es.avalon.Clases9FacturaAbstrascto;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {

		FacturaConIVA facturaNormal = new FacturaConIVA(2, "Factura Normal", 100);
		FacturaSinIVA facturaSinIVA = new FacturaSinIVA(3, "Factura sin IVA", 100);
		FacturaReducida facturaReducida = new FacturaReducida(4, "Factura reducida", 100);

		ArrayList<Factura> facturas = new ArrayList<Factura>();

		facturas.add(facturaNormal);
		facturas.add(facturaSinIVA);
		facturas.add(facturaReducida);

		mostrarFactura(facturas);

	}

	private static void mostrarFactura(ArrayList<Factura> facturas) {
		for (Factura unaFactura : facturas) {
			System.out.println(unaFactura.getConcepto() + " " + unaFactura.getImporte() + " Euros");
		}
	}

}
