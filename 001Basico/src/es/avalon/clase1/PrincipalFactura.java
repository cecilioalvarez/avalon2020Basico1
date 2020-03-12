package es.avalon.clase1;

public class PrincipalFactura {

	public static void main(String[] args) {
		Factura f= new Factura();
		f.concepto="supermercado";
		f.importe=25;
		f.numero=13;
		
		System.out.println(f.numero);
		System.out.println(f.concepto);
		System.out.println(f.importe);
		System.out.println(f.CalcularIVA21());
		System.out.println(f.Retencion());
		System.out.println(f.Ingreso());

	}

}
