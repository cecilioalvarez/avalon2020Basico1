package es.avalon.clases1;

public class Principal4factura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		factura f1=new factura();
		f1.numero=2546;
		f1.concepto="gasolina";
		f1.importe=67.56;
		
		System.out.println(f1.calcularIVA());
		System.out.println(f1.calcularRetencion());
		System.out.println(f1.totalingresarcuenta());
	}

}
