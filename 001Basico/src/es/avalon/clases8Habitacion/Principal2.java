package es.avalon.clases8Habitacion;

public class Principal2 {

	public static void main(String[] args) {
		Habitacion h= new Habitacion ("salon");
		Bombilla b1 = new Bombilla(true);
		h.setBombilla(b1);
		System.out.println(h.getBombilla().estaEncendida());

	}

}
