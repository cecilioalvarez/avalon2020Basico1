package es.avalon.clases6composicion3;

public class Principal2 {

	public static void main(String[] args) {
		
		Habitacion h1=new Habitacion("salon");
		
		Bombilla b1=new Bombilla(false);
		Bombilla b2=new Bombilla(true);
		h1.setBombilla1(b1);
		h1.setBombilla2(b2);
		
		System.out.println(h1.getBombilla1().estaEncendida());
		System.out.println(h1.getBombilla2().estaEncendida());
		
	}
}
