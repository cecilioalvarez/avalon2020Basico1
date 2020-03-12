package es.avalon.Clases2;

public class Telefono {

	private int numero;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if (numero > 7_000_000) {
			this.numero = 0;
		} else {
			this.numero = numero;
		}
	}
}
