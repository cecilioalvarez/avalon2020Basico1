package es.avalon.Clases9FacturaAbstrascto;

public class FacturaReducida extends Factura{

	public FacturaReducida(int numeroFactura, String concepto, double importe) {
		super(numeroFactura, concepto, importe);
	}

	@Override
	public double getImporteFactura() {
		return getImporte()*1.07;
	}

	
}
