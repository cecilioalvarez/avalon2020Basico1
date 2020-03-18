package es.avalon.interfaces2;

public class Caldera implements ElementoCasa {

	
	private boolean encender;
	
	public boolean isEncender() {
		return encender;
	}
	
	public void setEncender(boolean encender) {
		this.encender = encender;
	}
	
	@Override
	public void encender() {
	
		this.encender=true;
		System.out.println("se enciende la caldera");
	}

	@Override
	public void apagar() {
		
		this.encender=false;
		System.out.println("se apaga la caldera");
	}


}
