package es.avalon.clases9.polimorfismo2;

public class FacturaSinIVA extends FacturaReducida {

	public FacturaSinIVA(int numero, String concepto, double importe) {
		super(numero, concepto, importe);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getImporteConIVA() {
		// TODO Auto-generated method stub
		return getImporte();
	}

}
