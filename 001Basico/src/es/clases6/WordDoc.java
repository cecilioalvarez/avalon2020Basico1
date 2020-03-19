package es.clases6;

public class WordDoc {
	private String texto;
	private Impresora impresora; 
	


	public String getTexto() {
		return texto;
	}


	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Impresora getImpresora() {
		return impresora;
	}
	
	
	public void setImpresora(Impresora impresora) {
		this.impresora = impresora;
	}

	public WordDoc(Impresora impresora) {
		super();
		this.impresora = impresora;
	}


	public void ImprimirDocumento(String texto) {
		impresora.imprimir(texto);
	}
}
