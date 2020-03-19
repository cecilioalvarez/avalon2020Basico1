package es.avalon.Factura;

public class FacturaNormal extends Factura {

	public FacturaNormal(int numeroFactura, String concepto, double importe) {
		super(numeroFactura, concepto, importe);
	}

	@Override
	public double getImporte() {
		return super.getImporte()*1.21;
	}

	
}
