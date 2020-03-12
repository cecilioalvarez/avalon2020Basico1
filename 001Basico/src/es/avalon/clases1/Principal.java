package es.avalon.clases1;

public class Principal {

	public static void main(String[] args) {

		Donut d1=new Donut(); //la primera parte asigna esa estructura a mi variable, la segunda parte de la igualdad genera una estructura en memoria
		d1.precio=1;
		d1.sabor="chocolate";
		
		Donut d2=new Donut();
		d2.precio=2;
		d2.sabor="fresa";
		
		//el operador . me permite acceder a cada propiedad del objeto
		System.out.println(d1.precio);
		System.out.println(d1.sabor);
		System.out.println(d2.precio);
		System.out.println(d2.sabor);
		

	}

}
