package Clase7Factura;

public class FacturaNoIva extends Factura{


	public FacturaNoIva(int numero, String concepto, int importe) {
		super(numero, concepto, importe);
		
	}
	@Override
	public double calcularImporte() {
		
		return getImporte();
	}



}
