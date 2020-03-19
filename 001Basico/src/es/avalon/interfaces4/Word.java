package es.avalon.interfaces4;

public class Word {

	// variable que es un interface
	// puntero a un objeto que implemente el interface

	private Impresora impresora;

	public Impresora getImpresora() {
		return impresora;
	}

	public void setImpresora(Impresora impresora) {
		this.impresora = impresora;
	}

	// constructor
	public Word(Impresora impresora) {
		super();
		this.impresora = impresora;
	}

	public Word() {
		super();
	}

	public void imprimirTexto(String texto) {
		// es de una sola linea

		if (this.impresora != null) {

			impresora.imprimir(texto);
		} else {
			System.out.println("no hay impresora");
		}
	}
}
