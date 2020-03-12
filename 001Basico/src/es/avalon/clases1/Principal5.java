package es.avalon.clases1;

public class Principal5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Factura f1 = new Factura();
		f1.Concepto = "iPhone";
		f1.Numero = 1;
		f1.Importe = 1000;
		
		System.out.println(f1.Numero);
		System.out.println(f1.Concepto);
		System.out.println(f1.Importe);
		System.out.println(f1.calcularIVA());
		System.out.println(f1.calcularRetencion());
		System.out.println(f1.totalIngresarCuenta());

	}

}
