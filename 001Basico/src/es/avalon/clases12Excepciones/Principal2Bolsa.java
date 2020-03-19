package es.avalon.clases12Excepciones;

public class Principal2Bolsa {

	public static void main(String[] args) {


		Bolsa b=new Bolsa(3);
		
		try {
			b.addItem("Patatas");
			b.addItem("Chaskys");
			b.addItem("Alcaparras");
			b.addItem("Chocolate");  //-->Este no me lo acepta porque lo hemos limitado a 3 items
		} catch (Exception e) {
			System.out.println("Ha ocurrido un error");
		}

		System.out.println("El programa sigue");
	}

}
