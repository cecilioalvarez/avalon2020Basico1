package es.avalon.Clases5;

public class Principal {

	public static void main(String[] args) {

		Bolsa bolsa1 = new Bolsa("mercadona", 30);
		Bolsa bolsa2 = new Bolsa("lupa", 40);
		Bolsa bolsa3 = new Bolsa("erosky", 50);

		Bolsa[] bolsas = new Bolsa[] { bolsa1, bolsa2, bolsa3 };

		for (int i = 0; i < bolsas.length; i++) {

			Bolsa bolsa = bolsas[i];
			System.out.println(bolsa.getPeso());
		}
		Bolsa.getPesoTotal();
		
		bolsa1.esMayorQue(bolsa3);

		}

}
