package es.avalon.clases6composicion4;

public class Principal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Habitacion h = new Habitacion();

		Bombilla b1 = new Bombilla(true);
		Bombilla b2 = new Bombilla(false);
		h.setBombilla1(b1);
		h.setBombilla2(b2);

		System.out.println(h.getBombilla1().estaEncendida());
		System.out.println(h.getBombilla2().estaEncendida());

	}

}
