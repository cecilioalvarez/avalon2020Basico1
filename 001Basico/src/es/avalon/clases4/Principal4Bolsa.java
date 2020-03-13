package es.avalon.clases4;

public class Principal4Bolsa {

	public static void main(String[] args) {

		Bolsa b0=new Bolsa(1,25);	
		Bolsa b1=new Bolsa(2,7);
		Bolsa b2=new Bolsa(3,5);
		//Agrupando la informacion de una forma mas sencilla para manejar
		Bolsa[] bolsas=new Bolsa[] {b0,b1,b2};

		System.out.println(calcularPesoTotal(bolsas));
	}
	private static int calcularPesoTotal(Bolsa[] bolsas) {
		int pesoinicial=0;
		
		for(int i=0;i<bolsas.length;i++) {
			pesoinicial=pesoinicial+bolsas[i].getPeso();
		}
		return pesoinicial;
	}
}
