package es.avalon.clases9PolimorfismoFactura;

public class FacturaConIva extends Factura {

	public FacturaConIva(int numero, String concepto, double importe) {
		super(numero, concepto, importe);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getImporteConIva() {
		// TODO Auto-generated method stub
		return getImporte()*1.21;
	}

}
