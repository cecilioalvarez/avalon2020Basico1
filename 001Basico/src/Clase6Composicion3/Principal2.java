package Clase6Composicion3;

public class Principal2 {

	public static void main(String[] args) {
	
		Bombilla b1= new Bombilla(true);
		Habitacion h= new Habitacion("salon",b1);
	
		h.setBombi(b1);
		
		System.out.println(h.getBombi().isOn());
	}

}
