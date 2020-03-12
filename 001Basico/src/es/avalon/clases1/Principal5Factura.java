package es.avalon.clases1;

public class Principal5Factura {

	public static void main(String[] args) {

		Factura f1=new Factura();
		f1.numero=1;
		f1.concepto="comida";
		f1.importe=1000;
		System.out.println("Nº factura -> "+f1.numero);
		System.out.println("Concepto -> "+f1.concepto);
		System.out.println("Precio con IVA -> "+f1.calcularIVA());
		System.out.println("Retencion -> "+f1.retencion());
		System.out.println("Beneficios -> "+f1.totalingresarCuenta());

	}

}
