package es.clases4;

public class Smartphone extends Telefono{
	
	private String Whassapp;
	
	
	
	public String getWhassapp() {
		return Whassapp;
	}



	public void setWhassapp(String whassapp) {
		Whassapp = whassapp;
	}



	public Smartphone(int numero, String marca) {
		super(numero, marca);
			}
	
	public void llamarVideo(String otroWhassapp) {
	System.out.println("videollamada desde"+ getWhassapp()+"a"+otroWhassapp);
	}
	
}
