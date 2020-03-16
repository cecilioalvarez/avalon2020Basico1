package es.avalon.clases6composicion4;

public class Principal2habitacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		habitacion h=new habitacion("salon");
		bombilla b1=new bombilla(true);
		bombilla b2=new bombilla(false);
		h.setBombilla1(b1);
		h.setBombilla2(b2);
		
		System.out.println("bombilla 1 -> "+h.getBombilla1().isEncendida());
		System.out.println("bombilla 2 -> "+h.getBombilla2().isEncendida());
	}

}
