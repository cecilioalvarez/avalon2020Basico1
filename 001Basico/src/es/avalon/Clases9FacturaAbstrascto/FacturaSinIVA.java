package es.avalon.Clases9FacturaAbstrascto;

public class FacturaSinIVA extends Factura{

	public FacturaSinIVA(int numeroFactura, String concepto, double importe) {
		super(numeroFactura, concepto, importe);
	}

	@Override
	public double getImporteFactura() {
		return getImporte();
	}

}
