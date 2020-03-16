package es.avalon.clases6composicion3;

public class Principal {

	public static void main(String[] args) {
		
		Bombilla b1= new Bombilla(true);
		
		imprimirEstadoBombilla(b1);
		b1.apagar();
		imprimirEstadoBombilla(b1);
		b1.encender();
		imprimirEstadoBombilla(b1);
	}
	
	
	public static void imprimirEstadoBombilla(Bombilla b) {
		
		if (b.estaEncendida()) {
			
			System.out.println("encendida");
		}else {
			System.out.println("apagada");
		}
	}

}
