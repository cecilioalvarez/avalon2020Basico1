package es.avalon.Clases1;

public class PrincipalFactura {

	public static void main(String[] args) {
		
		Factura f1= new Factura();
		f1.numero=863517362;
		f1.importe=90;
		f1.concepto="Gastos Mensuales";
		
		
		System.out.println(f1.calcularIva());
		System.out.println(f1.calcularRetencion());
		System.out.println(f1.totalIngresarCuenta());
		

		
	

	}

}
