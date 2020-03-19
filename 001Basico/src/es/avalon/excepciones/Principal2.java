package es.avalon.excepciones;

public class Principal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bolsa b=new Bolsa(3);
			try {
				b.addItem("galletas");
				b.addItem("galletas");
				b.addItem("galletas");
				b.addItem("chocolate");
			} catch (Exception e) {
				System.out.println("ha ocurrido un error");
			}
			
			System.out.println("el programa sigue");
	}

}
