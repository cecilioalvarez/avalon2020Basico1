package es.avalon.Clases5;

public class Principal {

	public static void main(String[] args) {

		Bolsa bolsa1= new Bolsa("Mercadona", 10);
		Bolsa bolsa2= new Bolsa("Mercadona", 30);
		Bolsa bolsa3= new Bolsa("Mercadona", 30);
		
		System.out.println(bolsa1.getPeso());
		System.out.println(bolsa2.getPeso());
		System.out.println(bolsa3.getPeso());
		
		Bolsa.getPesoTotal();
	}

}
