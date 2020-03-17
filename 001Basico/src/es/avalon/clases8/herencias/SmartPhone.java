package es.avalon.clases8.herencias;

public class SmartPhone extends Telefono{
	
	private String whatsapp;

	public String getWhatsapp() {
		return whatsapp;
	}

	public void setWhatsapp(String whatsapp) {
		this.whatsapp = whatsapp;
	}

	public SmartPhone(int numero, String marca) {
		super(numero, marca);
		// TODO Auto-generated constructor stub
	}
	
	public void llamarVideo(String otroWhatsapp) {
		System.out.println("llamada de video desde "+ getWhatsapp()+"a "+ otroWhatsapp);
	}

}
