package es.avalon.clases6composicion5;

public class Bombilla {
	
	private boolean Encendido;
	

	//Getters y setters
	public boolean isEncendido() {
		return Encendido;
	}
	
	public void setEncendido(boolean encendido) {
		Encendido = encendido;
	}

	
	//Modificar estado de la bombilla
	public void encender() {
		this.setEncendido(true);
	}
	public void apagar() {
		this.setEncendido(false);
	}

	
	//Constructor
	
	public Bombilla(boolean encendido) {
		super();
		Encendido = encendido;
	}
	

//	public static void imprimirEstadoBombilla(Bombilla b) {
//		if (b.isEncendido() ) {
//			System.out.println("encendida");
//		}else {
//			System.out.println("apagada");
//		}
//	}
}
