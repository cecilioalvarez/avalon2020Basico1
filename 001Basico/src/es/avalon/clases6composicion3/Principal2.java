package es.avalon.clases6composicion3;

public class Principal2 {

	public static void main(String[] args) {
		
		Habitacion h=new Habitacion("salon");
		
		Bombilla b1=new Bombilla(false);
		Bombilla b2=new Bombilla(true);
		h.setBombilla1(b1);
		h.setBombilla2(b2);
		
		System.out.println(h.getBombilla1().estaEncendida());
		System.out.println(h.getBombilla2().estaEncendida());
		
	}
}