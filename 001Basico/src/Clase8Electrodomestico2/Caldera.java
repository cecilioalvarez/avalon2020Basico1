package Clase8Electrodomestico2;

public class Caldera implements Electrodomesticos {

	private boolean encender;

	public boolean isEncender() {
		return encender;
	}

	public void setEncendido(boolean encender) {
		this.encender = encender;
	}

	@Override
	public void pulsar() {
		if(isEncender()==true) {
			encender=false;
		}else {
			encender=true;
		}
		System.out.println("Caldera estado"+encender);
	}


	
	
}