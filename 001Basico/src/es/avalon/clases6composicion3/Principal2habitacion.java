package es.avalon.clases6composicion3;

public class Principal2habitacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		habitacion2 h=new habitacion2("salon");
		bombilla2 b1=new bombilla2(true);
		h.setBombilla2(b1);
		
		System.out.println(h.getBombilla2().isEncendida());
	}

}
