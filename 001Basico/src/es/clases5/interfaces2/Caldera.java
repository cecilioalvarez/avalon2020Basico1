package es.clases5.interfaces2;

public class Caldera implements ElementoCasa{
private boolean encender;
	

public boolean isEncender() {
	return encender;
}

//public void setEncender(boolean encender) {
//	this.encender = encender;
//}

	@Override
	
	
	public void interruptor() {
		// TODO Auto-generated method stub
		if(isEncender()) {
		encender=false;		
		}else {
	encender= true;
		}
		System.out.println("caldera estado:" + isEncender());
	}

	}

	


