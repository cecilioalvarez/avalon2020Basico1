package es.avalon.clases4;

public class Principal2 {

	public static void main(String[] args) {
		
		
//		Factura f= new Factura(1,100);
//		System.out.println(f.getNumero());
//		System.out.println(f.getImporte());
//		
//		//statica sin objetos
//		System.out.println(Factura.calcularIVA(5000));
//		
//		// para un objeto concreto
//		System.out.println(f.calcularIVA());
		
		System.out.println(Factura.calcularIVA(3500));

		Factura f= new Factura(1,3500);
		System.out.println(f.calcularIVA());
	}

}
