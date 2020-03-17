package Clase7Herencia;

public class SmartPhone extends Telefono{

	private String whatsapp;
	
	
	public String getWhatsapp() {
		return whatsapp;
	}


	public void setWhatapp(String whatsapp) {
		this.whatsapp = whatsapp;
	}


	public SmartPhone(int numero, String marca) {
		super(numero, marca);
	}

	public SmartPhone(int numero, String marca,String whatsapp) {
		super(numero, marca);
		this.whatsapp = whatsapp;
	}	
	public void llamarVideos(String otroWhatsapp) {
		System.out.println("llamada de video desde"+getWhatsapp()+"a"+otroWhatsapp);
	}
}
