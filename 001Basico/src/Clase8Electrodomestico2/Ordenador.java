package Clase8Electrodomestico2;

public class Ordenador implements Electrodomesticos  {
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
		System.out.println("Frigo estado"+encender);
	}



	
}