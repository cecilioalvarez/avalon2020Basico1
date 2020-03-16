package es.avalon.clases5repaso;


public class Principal10 {

	public static void main(String[] args) {
		// Generacion variables
		Bolsa b0 = new Bolsa(0, 10);
		Bolsa b1 = new Bolsa(1, 20);
		Bolsa b2 = new Bolsa(2, 15);
		
		//Agrupacion
		Bolsa[] bolsas = new Bolsa[] {b0,b1,b2};
		
		System.out.println(pesoTotal(bolsas));
			
		}
	
	private static int pesoTotal(Bolsa[] bolsas) {
		int sumaPesos = 0;
		
		for (int i=0; i < bolsas.length; i++) {
			sumaPesos = sumaPesos + bolsas[i].getPeso();	
		}
		return sumaPesos;
	}

}
