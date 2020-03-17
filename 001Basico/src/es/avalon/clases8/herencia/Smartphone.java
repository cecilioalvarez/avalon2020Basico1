package es.avalon.clases8.herencia;

public class Smartphone extends Telefono{
	
	private String whatapp;
	

	public String getWhatapp() {
		return whatapp;
	}


	public void setWhatapp(String whatapp) {
		this.whatapp = whatapp;
	}


	public Smartphone(int numero, String marca) {
		//Invoca al constructor de la clase superior
		super(numero, marca);

	}
	
	public void llamarVideo(String otroWhatapp) {
		
		System.out.println("LLamada de video desde " + getWhatapp() + " a " + otroWhatapp);
	}
	

}
