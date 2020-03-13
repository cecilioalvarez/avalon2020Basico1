package es.avalon.clases5;

public class PrincipalFactura {

	public static void main(String[] args) {
		Factura f= new Factura (1,100);
		System.out.println(f.getNumero());
		System.out.println(f.getImporte());
		//statica sin objetos
		
		System.out.println(Factura.calcularIVA(100));
		//para un objeto concreto
		
		System.out.println(f.calcularIVA());

	}

}
