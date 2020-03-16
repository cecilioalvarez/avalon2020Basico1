package es.avalon.clases6composicion3;

public class Principal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Habitacion h = new Habitacion("Salon");

		Bombilla b1 = new Bombilla(true);
		h.setBombilla(b1);

		System.out.println(h.getBombilla().estaEncendida());

	}

}
