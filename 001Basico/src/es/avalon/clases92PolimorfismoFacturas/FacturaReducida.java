package es.avalon.clases92PolimorfismoFacturas;

public class FacturaReducida extends Factura {

	public FacturaReducida(int numero, String concepto, double importe) {
		super(numero, concepto, importe);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getImporteConIVA() {
		// TODO Auto-generated method stub
		return getImporte()*1.07;
	}

}
