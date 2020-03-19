package es.clases6;

public class Principal3_trycatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bolsa b = new Bolsa(3);
//se necesita el try catch porque 
		// puede lanzar una excepcion y te oblica a capturarla
		// NECERARIO SIEMPRE QUE EXCEPTION
		try {
			b.addItem("galletas");
			b.addItem("galletas");
			b.addItem("galletas");
			b.addItem("galletas");
		} catch (Exception e) {
		//	e.printStackTrace(); //sale el mensaje de error de la clase bolsa
			System.out.println("Error");
		}
		System.out.println("el programa sigue");// el programa ha pilado el error y sigue con el resto del codigo
	}

}
