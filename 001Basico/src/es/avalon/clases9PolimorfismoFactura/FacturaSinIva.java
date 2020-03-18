package es.avalon.clases9PolimorfismoFactura;

public class FacturaSinIva extends FacturaReducida {

	public FacturaSinIva(int numero, String concepto, double importe) {
		super(numero, concepto, importe);
		
	}

	@Override
	public double getImporteConIva() {
		
		return getImporte();
	}

}
