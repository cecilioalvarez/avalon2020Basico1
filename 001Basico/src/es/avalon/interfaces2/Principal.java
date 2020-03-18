package es.avalon.interfaces2;

public class Principal {

	public static void main(String[] args) {
		
		
		ElementoCasa e1= new Caldera();
		ElementoCasa e2= new Frigorifico();
		
		Frigorifico otro= (Frigorifico)e2;
		
		
		e1.encender();
		e2.encender();
		
		

	}

}
