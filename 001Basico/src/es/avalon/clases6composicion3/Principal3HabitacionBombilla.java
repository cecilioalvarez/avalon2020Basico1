package es.avalon.clases6composicion3;

public class Principal3HabitacionBombilla {

	public static void main(String[] args) {
		
		Bombilla b1=new Bombilla(true);
		
		System.out.println(b1.estaEncendida());
		b1.apagar();
		System.out.println(b1.estaEncendida());
		b1.encender();
		System.out.println(b1.estaEncendida());
		
	}
}

