package es.avalon.clases9polimorfismo2;

public class FacturaReducida extends Factura {

	public FacturaReducida(int numero, String concepto, double importe) {
		super(numero, concepto, importe);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double importeIVA() {
		return getImporte()*1.07;
	}

	
}
