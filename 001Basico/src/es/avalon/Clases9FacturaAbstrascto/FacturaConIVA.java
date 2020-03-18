package es.avalon.Clases9FacturaAbstrascto;

public class FacturaConIVA extends Factura {

	public FacturaConIVA(int numeroFactura, String concepto, double importe) {
		super(numeroFactura, concepto, importe);
	}

	@Override
	public double getImporteFactura() {
		return getImporte()*1.21;
	}

	
}
