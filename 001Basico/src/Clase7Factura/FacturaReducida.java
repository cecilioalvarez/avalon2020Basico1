package Clase7Factura;

public class FacturaReducida extends Factura {


	public FacturaReducida(int numero, String concepto, int importe) {
		super(numero, concepto, importe);

	}

	@Override
	public double calcularImporte() {

		return getImporte() * 1.07;
	}
}
