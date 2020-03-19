package es.avalon.interfaces2;

public class Principal {

	public static void main(String[] args) {
		
		ElementoCasa e1 = new Ordenador();
		ElementoCasa e2 = new Television();
		ElementoCasa e3 = new Caldera();
		
		
		
		System.out.println(e1.estado());
		e1.encender();
		System.out.println(e1.estado());
		

	}

}
