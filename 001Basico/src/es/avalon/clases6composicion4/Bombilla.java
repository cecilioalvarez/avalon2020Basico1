package es.avalon.clases6composicion4;

public class Bombilla {
	
	private boolean Encendido;
	
	private Habitacion habitacion;
	
	//Getters y setters
	public boolean isEncendido() {
		return Encendido;
	}
	
	public void setEncendido(boolean encendido) {
		Encendido = encendido;
	}

	public Habitacion getHabitacion() {
		return habitacion;
	}

	public void setHabitacion(Habitacion habitacion) {
		this.habitacion = habitacion;
	}

	
	//Modificar estado de la bombilla
	public void encender() {
		this.setEncendido(true);
	}
	public void apagar() {
		this.setEncendido(false);
	}

	
	//Constructor
	
	public Bombilla(boolean encendido, Habitacion habitacion) {
		super();
		Encendido = encendido;
		this.habitacion = habitacion;
	}
	
	public static void imprimirEstadoBombilla(Bombilla b) {
		if (b.isEncendido() ) {
			System.out.println("encendida");
		}else {
			System.out.println("apagada");
		}
	}
}
