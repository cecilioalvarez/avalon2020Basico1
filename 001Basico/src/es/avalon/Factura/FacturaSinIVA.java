package es.avalon.Factura;

public class FacturaSinIVA extends Factura{

	public FacturaSinIVA(int numeroFactura, String concepto, double importe) {
		super(numeroFactura, concepto, importe);
	}

	@Override
	public double getImporte() {
		double importe1= super.getImporte();
		return importe1-importe1*0.21;
	}

}
