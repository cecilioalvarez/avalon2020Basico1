package es.avalon.clasesComposicion4;

public class Principal2 {

	public static void main(String[] args) {
		Habitacion h= new Habitacion();
		Bombilla b1 = new Bombilla(true);
		Bombilla b2 = new Bombilla(False);
		h.setBombilla2(b2);
		
		h.setBombilla1(b1);
		System.out.println(h.getBombilla1().estaEncendida());
		System.out.println(h.getBombilla2().estaEncendida());
	}

}
