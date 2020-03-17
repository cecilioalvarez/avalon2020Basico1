package es.avalon.clases8Herencia;

public class SmartPhone extends Telefono {

	private String whatsapp;
	
	public String getWhatsapp() {
		return whatsapp;
	}

	public void setWhatsapp(String whatsapp) {
		this.whatsapp = whatsapp;
	}

	public SmartPhone(int numero, String marca) {
		//invocamos al constructor de la clase superior (telefono)
		super(numero, marca);
	}

	public void llamarVideo(String otroWhatsapp) {
		System.out.println("llamada de video desde "+getWhatsapp()+"a "+otroWhatsapp);
	}
}
