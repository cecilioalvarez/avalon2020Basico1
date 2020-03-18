package es.avalon.clases9Polimorfismo2;

public class FacturaConIVA extends Factura{

	public FacturaConIVA(int numero, String factura, int importe) {
		super(numero, factura, importe);
	}

	@Override	
	public double CalcularIVA() {
		return getImporte()*1.21;
		}
	
}
