package es.avalon.clases1;

public class Principal2donut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		donut d1=new donut();
		d1.sabor="fresa";
		d1.precio=1;
		
		System.out.println(d1.sabor);
		System.out.println(d1.precio);
		System.out.println(d1.precioConIVA());
		
	}

}
