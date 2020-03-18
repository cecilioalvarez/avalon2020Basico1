package es.avalon.clases9Interface;

public class WhatsApp  implements Mensajeria {
	
	private String cuenta;

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public WhatsApp(String cuenta) {
		super();
		this.cuenta = cuenta;
	}
	public void enviarMensaje (String texto) {
		System.out.println("mandamos un Whatsapp"+cuenta+"con el texto"+texto);
	
	
	

}
}
