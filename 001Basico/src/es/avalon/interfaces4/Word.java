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
	
	public Word() {
		super();
	}
	
	public void imprimirTexto(String texto) {
		if (this.impresora!=null)
			impresora.imprimir(texto);
		else
			System.out.println("no hay impresora");
	}
	
	
	    

}
