package es.avalon.clases4;

public class Principal3ejemplar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ejemplar e=new ejemplar(253,0.75);
		
		System.out.println("codigo e1 -> "+e.getCodigo());
		System.out.println("peso e1 -> "+e.getPeso());
		
		ejemplar e2=new ejemplar(246,1);
		
		System.out.println("codigo e2 -> "+e2.getCodigo());
		System.out.println("peso e2 -> "+e2.getPeso());
		
		System.out.println("peso total de ejemplares -> "+ejemplar.getPesototal());
	}

}
