package es.avalon.Clases9Factura;

public class FacturaReducida extends Factura{

	public FacturaReducida(int numeroFactura, String concepto, double importe) {
		super(numeroFactura, concepto, importe);
	}

	@Override
	public double getImporte() {
		return super.getImporte()*1.07;
	}

	
}
