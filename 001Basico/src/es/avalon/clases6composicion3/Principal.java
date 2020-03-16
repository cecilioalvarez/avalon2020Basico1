package es.avalon.clases6composicion3;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Habitacion h1 = new Habitacion("dormitorio");
		
		Bombilla b1 = new Bombilla(true,h1);
		
		h1.setBombilla(b1);
		System.out.println(h1.getBombilla().isEncendido());
		
		//Apago la luz
		h1.getBombilla().apagar();
		System.out.println(h1.getBombilla().isEncendido());
		
		//Donde está la bombilla
		System.out.println(b1.getHabitacion().getNombre());

	}

}
