package es.clases4;

public class FacturaSinIVA extends Factura{

	public FacturaSinIVA(int numero, String concepto, double importe) {
		super(numero, concepto, importe);
		// TODO Auto-generated constructor stub
	}
	public double conIVA () {
		return getImporte()*1.00;
	}
}
