package es.avalon.interfaces4;

public class Word {
	
	private Impresora impresora;

	public Impresora getImpresora() {
		return impresora;
	}

	public void setImpresora(Impresora impresora) {
		this.impresora = impresora;
	}

	public Word(Impresora impresora) {
		super();
		this.impresora = impresora;
	}
	
	public void imprimirTexto(String texto) {
		
		impresora.imprimir(texto);
		
	}
	

	
	

}
