package es.avalon.clase1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			 Donut d1= new Donut();
			 d1.precio=1;
			 d1.sabor="chocolate";
			
			 Donut d2= new Donut();
			 d2.precio=2;
			 d2.sabor="Fresa";
			 
			 
			 
			 
			 System.out.println(d1.precio);
			 System.out.println(d1.sabor);
			 System.out.println(d1.precioConIVA());
			 System.out.println(d2.precio);
			 System.out.println(d2.sabor);
			 System.out.println(d2.precioConIVA());
	}

}
