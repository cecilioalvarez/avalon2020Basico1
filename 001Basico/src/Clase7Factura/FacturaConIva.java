package Clase7Factura;

public class FacturaConIva extends Factura {

	public FacturaConIva(int numero, String concepto, int importe) {
		super(numero, concepto, importe);
		
	}
	@Override
	public double calcularImporte() {
		
		return getImporte()*1.07;
	}

}
