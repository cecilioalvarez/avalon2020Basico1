package es.clases4;

public class FacturaReducida extends Factura{

	public FacturaReducida(int numero, String concepto, double importe) {
		super(numero, concepto, importe);
		// TODO Auto-generated constructor stub
		
	}		
		public double conIVA () {
			return getImporte()*1.07;
	}

}
