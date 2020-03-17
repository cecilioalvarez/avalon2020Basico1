package es.avalon.clases9Herencia;

public class Telefono {

	private String numero;
	private String marca;

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Telefono(String numero, String marca) {
		super();
		this.numero = numero;
		this.marca = marca;
	}

	public void llamar(int otroNumero) {
		System.out.println("desde el numero" + getNumero() + "llamamos a" + otroNumero);
	}

}
