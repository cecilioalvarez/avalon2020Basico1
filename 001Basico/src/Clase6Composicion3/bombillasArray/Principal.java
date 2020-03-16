package Clase6Composicion3.bombillasArray;

public class Principal {
	public static void main(String[] args) {
	Bombilla b1=new Bombilla(true);
	System.out.println(b1.isOn());
	b1.apagar();
	System.out.println(b1.isOn());
	b1.encender();
	System.out.println(b1.isOn());
	imprimirEstadoBombilla(b1);

}
	public static void imprimirEstadoBombilla(Bombilla b) {
		
		if(b.isOn()) {
			System.out.println("encendida");
		}else {
			System.out.println("apagada");
		}
	}
}