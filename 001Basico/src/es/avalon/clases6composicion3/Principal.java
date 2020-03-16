package es.avalon.clases6composicion3;

public class Principal {

	public static void main(String[] args) {
		
		Bombilla b1=new Bombilla(true);
		
		//crear la bombilla y esta encendida
		imprimirEstadoBombilla(b1);
		//apago bombilla
		b1.apagar();
		//imprimo estado apagada
		imprimirEstadoBombilla(b1);
		//Enciendo bombilla
		b1.encender();
		//imprimo estado encendida
		imprimirEstadoBombilla(b1);	
	}
	
	public static void imprimirEstadoBombilla(Bombilla b1) {
		
		if (b1.estaEncendida()) {
			System.out.println("encendida");
		}
		else {
			System.out.println("apagada");
		}
	}

	
}

