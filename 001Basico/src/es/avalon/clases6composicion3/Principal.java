package es.avalon.clases6composicion3;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Habitacion h1 = new Habitacion("dormitorio");
		Habitacion h2 = new Habitacion("salon");
		Habitacion h3 = new Habitacion("cocina");
		
		Bombilla b1 = new Bombilla(true,h1);
		Bombilla b2 = new Bombilla(false,h2);
		Bombilla b3 = new Bombilla(false,h3);
		
		h1.setBombilla(b1);
		h2.setBombilla(b2);
		h3.setBombilla(b3);
		
		imprimirEstadoBombilla(b1);
		
		//Apago la luz del dormitorio
		h1.getBombilla().apagar();
		imprimirEstadoBombilla(b1);
		
		//Donde está la bombilla
		System.out.println(b1.getHabitacion().getNombre());
		System.out.println(b2.getHabitacion().getNombre());
		System.out.println(h2.getBombilla().isEncendido());
		System.out.println(b3.getHabitacion().getNombre());
		System.out.println(h3.getBombilla().isEncendido());
		
		//Enciendo bombilla de la cocina
		h3.getBombilla().encender();
		System.out.println(b3.getHabitacion().getNombre());
		System.out.println(h3.getBombilla().isEncendido());
		
	}
	
	public static void imprimirEstadoBombilla(Bombilla b) {
		if (b.isEncendido() ) {
			System.out.println("encendida");
		}else {
			System.out.println("apagada");
		}
	}
	

}
