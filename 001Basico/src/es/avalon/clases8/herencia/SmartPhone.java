package es.avalon.clases8.herencia;

public class SmartPhone extends Telefono {

	private String whatapp;
	
	public String getWhatapp() {
		return whatapp;
	}

	public void setWhatapp(String whatapp) {
		this.whatapp = whatapp;
	}

	public SmartPhone() {
		super(123456789,"apple");
	}

	public SmartPhone(int numero, String marca) {
		//invocamos al constructor de la clase superior
		
		super(numero, marca);
		// TODO Auto-generated constructor stub
	}
	
	public SmartPhone(int numero, String marca,String whatapp) {
		//invocamos al constructor de la clase superior
		
		super(numero, marca);
		this.whatapp=whatapp;
		// TODO Auto-generated constructor stub
	}
	
	public void llamarVideo(String otroWhatapp) {
		
		System.out.println("llamada de video desde "+ getWhatapp()+ "a " + otroWhatapp);
	}

}
