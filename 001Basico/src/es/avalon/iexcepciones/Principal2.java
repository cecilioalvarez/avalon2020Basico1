package es.avalon.iexcepciones;

public class Principal2 {

	public static void main(String[] args) {
		
		
		Bolsa b= new Bolsa(3);
		try {
			b.addItem("galletas");
			b.addItem("galletas");
			b.addItem("galletas");
			//b.addItem("chocolate");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
