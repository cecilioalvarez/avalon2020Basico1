package clase9Excepciones;
 
public class PrincipalBolsa {

	public static void main(String[] args) {
		Bolsa b=new Bolsa(3);
		
		try {
			b.addItema("galletas");
			b.addItema("galletas");
			b.addItema("galletas");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
