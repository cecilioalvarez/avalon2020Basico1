package es.avalon.clases8.herencias;

public class Telefono {
	private int numero;
	private String marca;
	
	
	
	public int getNumero() {
		return numero;
	}



	public void setNumero(int numero) {
		this.numero = numero;
	}



	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public Telefono(int numero, String marca) {
		super();
		this.numero = numero;
		this.marca = marca;
	}



	public void llamar(int otroNumero) {
		System.out.println("desde el numero "+ getNumero() + " llamamos a " + otroNumero);
	}

}
