package es.avalon.clases9Polimorfismo2;

public class FacturaSinIVA extends Factura{

	public FacturaSinIVA(int numero, String factura, int importe) {
		super(numero, factura, importe);
	}

	@Override	
	public double CalcularIVA() {
		return getImporte()*1;
		}
	
}
