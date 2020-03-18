package es.avalon.clases9.polimorfismoFacturas;

public class FacturaNormal extends Factura{

	public FacturaNormal(int numero, String concepto, int importe) {
		
		super(numero, concepto, importe);
		
	}

	@Override
	public double getImporteConIVA() {
		// TODO Auto-generated method stub
		return getImporte()*1.21;
	}
	
}
