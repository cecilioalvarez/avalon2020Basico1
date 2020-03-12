package es.avalon;

public class facturaprincipal {
	public static void main (String [] args) {
		factura f1= new factura();
		f1.numbfactura=342581;
		f1.concepto="clases marzo";
		f1.importe=500;
		//el operador . me permite acceder a aceda a cada propiedad del objeto
		
		System.out.println(f1.iva());
		System.out.println(f1.retencion());
		System.out.println(f1.totalpago());
	}

}
