package es.avalon.clases1;

public class Principal5 {

	public static void main(String[] args) {
		
		
		Factura f= new Factura();
		
		f.numero=1;
		f.concepto="ordenador";
		f.importe=1000;
		
		System.out.println(f.calcularIVA());
		System.out.println(f.calcularRetencion());
		System.out.println(f.totalIngresarCuenta());
		

	}

}
