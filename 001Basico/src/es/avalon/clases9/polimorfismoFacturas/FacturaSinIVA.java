package es.avalon.clases9.polimorfismoFacturas;

public class FacturaSinIVA extends Factura{

	public FacturaSinIVA(int numero, String concepto, int importe) {
		super(numero, concepto, importe);
	}
	
	@Override
	public double getImporteConIVA() {
		
		return this.getImporte();
	}


}
