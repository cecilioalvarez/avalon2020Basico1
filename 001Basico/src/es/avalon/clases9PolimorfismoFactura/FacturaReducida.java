package es.avalon.clases9PolimorfismoFactura;

public class FacturaReducida extends Factura {

	public FacturaReducida(int numero, String concepto, double importe) {
		super(numero, concepto, importe);
		
	}

	@Override
	public double getImporteConIva() {
		// TODO Auto-generated method stub
		return getImporte()*1.07;
	}

}
