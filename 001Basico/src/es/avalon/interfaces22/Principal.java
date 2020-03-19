package es.avalon.interfaces22;

public class Principal {
	
	public static void main(String[] args) {

		ElementoCasa e1=new Caldera();
		ElementoCasa e2=new Ordenador();
		ElementoCasa e3=new Frigorifico();
	
		e1.encender();
		e2.encender();
		e3.encender();
	
		e1.apagar();
		e2.apagar();
		e3.apagar();
	
	}
}
