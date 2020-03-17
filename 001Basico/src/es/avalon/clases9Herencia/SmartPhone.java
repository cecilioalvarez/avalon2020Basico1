package es.avalon.clases9Herencia;

public class SmartPhone extends Telefono {
	private String whatsapp;

	public String getWhatsapp() {
		return whatsapp;
	}

	public void setWhatsapp(String whatsapp) {
		this.whatsapp = whatsapp;
	}

	public SmartPhone(int i, String marca) {
		super(i, marca);
		
	}
		public void llamarVideo(String otroWhatsapp) {
		System.out.println("llamada de video desde"+getWhatsapp()+"a"+otroWhatsapp);
		
		
	}

}
