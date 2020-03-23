package es.avalon.clases6composicion4;


//La bombilla no tendria porque tener relacion bidireccional con la habitacion
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Habitacion h1 = new Habitacion("dormitorio");

		Bombilla b1 = new Bombilla(true);
		Bombilla b2 = new Bombilla(false);

		
		h1.setBombilla1(b1);
		h1.setBombilla2(b2);

		//Situacion inicial
		System.out.println("Situacion inicial:");
		imprimirEstadoBombilla(b1);
		imprimirEstadoBombilla(b2);
		System.out.println("*********");
		//Apago la luz del dormitorio
		h1.getBombilla1().apagar();
		
		System.out.println("Se apaga la bombilla encendida:");
		imprimirEstadoBombilla(b1);
		imprimirEstadoBombilla(b2);
		
//		System.out.println(b1.getHabitacion().getNombre());

	}
	
	public static void imprimirEstadoBombilla(Bombilla b) {
		if (b.isEncendido() ) {
			System.out.println("encendida");
		}else {
			System.out.println("apagada");
		}
	}
	

}