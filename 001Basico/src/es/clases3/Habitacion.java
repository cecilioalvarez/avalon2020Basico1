package es.clases3;

public class Habitacion {
	private String NombreHabi; 

	private Bombilla bombilla1;
	
	private Bombilla bombilla2;
	
	public String getNombreHabi() {
		return NombreHabi;
	}

	public void setNombreHabi(String nombreHabi) {
		NombreHabi = nombreHabi;
	}

	public Habitacion(String nombreHabi) {
		super();
		NombreHabi = nombreHabi;
	}
	public Bombilla getBombilla1() {
		return bombilla1;
	}
	
	public void setBombilla1(Bombilla bombilla1) {
		this.bombilla1 = bombilla1;
	}
	
	public Bombilla getBombilla2() {
		return bombilla2;
	}
	
	public void setBombilla2(Bombilla bombilla2) {
		this.bombilla2 = bombilla2;
	}


	
}
