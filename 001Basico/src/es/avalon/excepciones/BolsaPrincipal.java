package es.avalon.excepciones;

public class BolsaPrincipal {

	public static void main(String[] args) {
		
		
		Bolsa b= new Bolsa(3);
		try {
			b.addItem("galletas");
			b.addItem("galletas");
			b.addItem("galletas");
			//b.addItem("chocolate");
		} catch (Exception e) {
			System.out.println("LA BOLSA ESTA LLENA ");
			e.printStackTrace();
		}
		System.out.println("Solo entran 3 elementos");
		

	}

}
