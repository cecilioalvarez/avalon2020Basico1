package es.avalon.clases11Interfaces4;

public class Word {

	// Se apolla en el interface impresora (imprimir documento)
	// Metodo imprimirDocumento(String texto, Impresora p)

	//Variable que es un interface (puntero a un objeto que implemente)
	private Impresora impresora;

	//Getter y setter
	public Impresora getImpresora() {
		return impresora;
	}

	public void setImpresora(Impresora impresora) {
		this.impresora = impresora;
	}

	//Constructor
	public Word(Impresora impresora) {
		super();
		this.impresora = impresora;
	}
	//Constructor vacio de word para cuando no hay impresora
	public Word() {
		super();
	}
	
	//Metodo
	public void imprimirDocumento(String texto) {
		if (this.impresora!=null)
			impresora.imprimir(texto);
		else
			System.out.println("No se detecta ninguna impresora");
	}
}
