package es.clases5;

public class Frigorifico implements ElementoCasa{
private boolean encender;
	

public boolean isEncernder() {
	return encender;
}

public void setEncernder(boolean encernder) {
	this.encender = encernder;
}

	@Override
	
	
	public void encender() {
		// TODO Auto-generated method stub
		this.encender= true;
		System.out.println("Frigo encendido");
	}

	@Override
	public void apagar() {
		// TODO Auto-generated method stub
		this.encender=false;
		System.out.println("Frigo apagado");
	}
	

}
