package es.avalon.clases6composicion3;

public class Principal2bombilla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		bombilla2 b1=new bombilla2(true);
		
//		System.out.println(b1.isEncendida());
//		b1.apagar();
//		System.out.println(b1.isEncendida());
//		b1.encender();
//		System.out.println(b1.isEncendida());
		
		//////////// otra opcion
		
		// creo la bombilla y esta encendida
		imprimirestadobombilla(b1);
		// apago
		b1.apagar();
		imprimirestadobombilla(b1);
		// enciendo
		b1.encender();
		imprimirestadobombilla(b1);
		
	}

	public static void imprimirestadobombilla(bombilla2 b) {
		
		if (b.isEncendida()) {
			System.out.println("encendida");
		}else {
			System.out.println("apagada");
		}
	}
}
