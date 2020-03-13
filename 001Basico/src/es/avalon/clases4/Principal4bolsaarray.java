package es.avalon.clases4;

public class Principal4bolsaarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		bolsa b1=new bolsa (1,2.5);
		bolsa b2=new bolsa (2,3);
		bolsa b3=new bolsa (3,2.2);
		
		bolsa[] bolsa=new bolsa[] {b1,b2,b3};
		
		System.out.println(calcularpesototal(bolsa));
		
	}

	private static double calcularpesototal(bolsa[] bolsa) {
		double pesototal=0;
		
		for (int i=0; i<bolsa.length; i++) {
			pesototal=pesototal+bolsa[i].getPeso();
		}
		return pesototal;
	}

}
