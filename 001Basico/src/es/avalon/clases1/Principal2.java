package es.avalon.clases1;

public class Principal2 {

	public static void main(String[] args) {
		
		Donut d1= new Donut();
		d1.sabor="fresa";
		d1.precio=1;
		System.out.println(d1.sabor);
		System.out.println(d1.precio);
		System.out.println(d1.precioConIVA());
		

	}

}
