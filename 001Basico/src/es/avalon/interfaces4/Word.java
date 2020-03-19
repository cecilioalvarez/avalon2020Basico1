package es.avalon.interfaces4;

public class Word {

	private Impresora impresora;

	private String documento;

	public Impresora getImpresora() {
		return impresora;
	}
	
	public void setImpresora(Impresora impresora) {
		this.impresora = impresora;
	}
	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String texto) {
		this.documento = documento;
	}

	public Word(Impresora impresora) {
		super();
		this.impresora=impresora;
	}
	
	public Word() {
		super();
	}
	
	public void imprimirDocumento(String texto) {
		
		// distinto de null
		if(this.impresora!=null)
			impresora.imprimir(texto);
		else
			System.out.println("no hay impresora");
	}
}
