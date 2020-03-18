package es.avalon.clases10Interfaces2;

public class Principal {

	public static void main(String[] args) {


		ElementoCasa e1=new Caldera();
		ElementoCasa e2=new Television();
		ElementoCasa e3=new Ordenador();
		
		e1.encender();
		e2.encender();
		e3.encender();
		
		e2.apagar();
		e3.apagar();
		
	}
}
