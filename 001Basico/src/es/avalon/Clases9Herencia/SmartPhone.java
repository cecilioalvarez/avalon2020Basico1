package es.avalon.Clases9Herencia;

public class SmartPhone extends Telefono {

	private String whatapp;

	public String getWhatapp() {
		return whatapp;
	}

	public void setWhatapp(String whatapp) {
		this.whatapp = whatapp;
	}

	public SmartPhone(int numero, String marca) {
		super(numero, marca);
	}

	public void llamarVideo(String otroWhatapp) {
		System.out.println("llamada de video desde " + getWhatapp() + " a " + otroWhatapp);
	}

}
