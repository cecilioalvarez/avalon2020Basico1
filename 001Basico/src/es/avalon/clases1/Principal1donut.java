package es.avalon.clases1;

public class Principal1donut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		donut d1=new donut(); // generas una nueva estructura de memoria
		d1.precio=1;
		d1.sabor="chocolate";
		donut d2=new donut(); 
		d2.precio=2;
		d2.sabor="fresa";
		
		// el operador me permite acceder a cada propiedad del objeto
		System.out.println(d1.precio);
		System.out.println(d1.sabor);
		System.out.println(d2.precio);
		System.out.println(d2.sabor);
		
	}

}
