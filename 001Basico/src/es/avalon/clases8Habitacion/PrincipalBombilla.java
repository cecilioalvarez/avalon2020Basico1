package es.avalon.clases8Habitacion;

public class PrincipalBombilla {

	public static void main(String[] args) {
		Bombilla b1= new Bombilla (true);
		
		imprimirEstadoBombilla(b1);
		b1.apagar();
		System.out.println(b1.estaEncendida());
		b1.encender();
		System.out.println(b1.estaEncendida());

	}

	public static void imprimirEstadoBombilla(Bombilla b) {
		if(b.estaEncendida()) {
			
		System.out.println("encendida");
		}else {
			System.out.println("apagada");
			
		}
	}
	
	
	
}
