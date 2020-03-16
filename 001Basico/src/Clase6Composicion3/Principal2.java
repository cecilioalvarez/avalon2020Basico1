package Clase6Composicion3;

public class Principal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		habitacion h= new habitacion("salon");
		Bombilla b1 new Bombilla(true);
		h.setBombilla(b1);
		
		System.out.println(h.getBombilla().isOn());
	}

}
