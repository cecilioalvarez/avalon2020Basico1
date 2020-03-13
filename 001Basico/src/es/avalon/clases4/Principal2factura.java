package es.avalon.clases4;

public class Principal2factura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		factura f=new factura(1,100);
		System.out.println(f.getNumero());
		System.out.println(f.getImporte());
		
		// para n objeto concreto
		System.out.println(f.calcularIVA());
		
		// metodo estatico sin objetos
		System.out.println(factura.calcularIVA(100));
		
		System.out.println(factura.calcularIVA(3500));
		
		factura f1=new factura(1,3500);
		System.out.println(f.calcularIVA());
	}

}
