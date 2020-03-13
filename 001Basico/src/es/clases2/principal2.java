package es.clases2;


import es.clases1.*;

public class principal2 {
	public static void main (String [] args) {
		factura f= new factura(1,100);

		System.out.println(f.getNumero());
		System.out.println(f.getImporte());
		//static sin objeto
		System.out.println(factura.calcularIVA(100));
		//objeto concreto
		System.out.println(f.calcularIVA());
		
//		ejemplar e1= new ejemplar(1,2);
//		ejemplar e2 = new ejemplar(1,3);
//		System.out.println(ejemplar.getPesoTotal());
		
		
	}

}
