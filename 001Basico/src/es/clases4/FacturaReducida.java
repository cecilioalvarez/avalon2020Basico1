package es.clases4;

public class FacturaReducida extends Factura{

	public FacturaReducida(int numero, String concepto, double importe) {
		super(numero, concepto, importe);
		// TODO Auto-generated constructor stub
		
	}		
		public void conIVA (double importe) {
			System.out.println( importe*1.1);
	}

}
