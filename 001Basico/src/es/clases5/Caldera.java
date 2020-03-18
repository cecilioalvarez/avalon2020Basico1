package es.clases5;

public class Caldera implements ElementoCasa{
private boolean encender;
	

public boolean isEncender() {
	return encender;
}

public void setEncender(boolean encender) {
	this.encender = encender;
}

	
	
	public void interruptor() {
		// TODO Auto-generated method stub
		if(isEncender()) {
			encender=false;
		}else {
		this.encender= true;
	
	
	}
		System.out.println("caldera estado:" + interruptor());
	}
	

}
