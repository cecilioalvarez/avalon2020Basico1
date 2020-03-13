package es.avalon.clase2;

public class PrincipalFactura {

	public static void main(String[] args) {
		Factura f=new Factura(1,100);
		
		System.out.println(f.getNumero());
		System.out.println(f.getImporte());
		System.out.println(Factura.calcularIVA(30));
		System.out.println(f.calcularIVA());
	}

}
