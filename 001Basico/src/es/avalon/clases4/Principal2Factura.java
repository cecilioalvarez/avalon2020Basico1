package es.avalon.clases4;

public class Principal2Factura {

	public static void main(String[] args) {

//		Factura f=new Factura(1,100);
//		System.out.println(f.getNumero());
//		System.out.println(f.getImporte());
		
		//estatica sin objetos (no me haria falta crear el objeto factura de la fila 7)
		System.out.println(Factura.calcularIVA(3500));
		//Para un objeto concreto
		Factura f=new Factura(1,3500);
		System.out.println(f.calcularIVA());
		

	}

}
