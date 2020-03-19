package es.avalon.dClases11Excepciones;

public class Principal2 {

	public static void main(String[] args) {

		Bolsa b = new Bolsa(3);
		try {
			b.addItem("galletas");
			b.addItem("galletas");
			b.addItem("galletas");
			b.addItem("galletas");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Ha ocurrido un error");
		} finally {
			System.out.println("Cerrando recursos ");
		}
	}
}
