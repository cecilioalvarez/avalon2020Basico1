package es.avalon.clasesComposicion4;

public class Principal2 {

	public static void main(String[] args) {
		Habitacion h= new Habitacion("habitacion1");
		Bombilla b1 = new Bombilla(true);
		Bombilla b2 = new Bombilla(false);
		h.setBombilla2(b2);
		
		h.setBombilla(b1);
		System.out.println(h.getBombilla().estaEncendida());
		System.out.println(h.getBombilla2().estaEncendida());
	}

}
