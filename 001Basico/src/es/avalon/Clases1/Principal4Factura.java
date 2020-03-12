package es.avalon.Clases1;

public class Principal4Factura {

	public static void main(String[] args) {
		
		Persona persona = new Persona();
		persona.nombre="Moises";
		persona.edad = 25;
		
		Donut donut = new Donut();
		donut.precio=1000;
		
		Factura factura = new Factura();
		factura.concepto="Factura del donut";
		factura.importe= donut.precio;
		factura.numeroFactura= 1;
		
		
		System.out.println("Factura con IVA : " + factura.calculaIVA());
		System.out.println("Retencion : " + factura.calculaRetencion());
		System.out.println("Total a ingresar : " + factura.totalIngeresarCuenta());
		
		System.out.println();
	}
}
