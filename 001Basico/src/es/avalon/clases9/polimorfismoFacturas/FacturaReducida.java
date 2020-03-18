package es.avalon.clases9.polimorfismoFacturas;

public class FacturaReducida extends Factura {

	public FacturaReducida(int numero, String concepto, int importe) {
		super(numero, concepto, importe);
	}
	
	@Override
	public double getImporteConIVA() {
		
		return getImporte()*1.07;
	}


}
