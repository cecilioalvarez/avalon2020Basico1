package Clase8Electrodomestico1;

public class Television implements Electrodomesticos {

	private boolean encender;

	public boolean isEncender() {
		return encender;
	}

	public void setEncendido(boolean encender) {
		this.encender = encender;
	}

	@Override
	public void encender() {
		
		this.encender=true;
		System.out.println("se enciende la television");
	}
	

	@Override
	public void apagar() {
		
		this.encender=false;
		System.out.println("se apaga la television");
	}

	
}
