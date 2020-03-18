package Clase8Mensaje;

public class Wathsapp implements Mensajeria {

	private String cuenta;

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public Wathsapp(String cuenta) {
		super();
		this.cuenta = cuenta;
	}
	public void enviarMensaje(String texto) {
		System.out.println("mandamos una carta"+cuenta + "con el texto"+ texto);
	}
}
